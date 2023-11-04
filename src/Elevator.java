
public class Elevator implements IElevator  {
    private boolean openDoors;
    private boolean stopped;
    private final Floor topFloor =Floor.FOURTH;
    private final Floor bottomFlor=Floor.ZERO;
    private Floor currentFloor=Floor.ZERO;
    @Override
    public void go(Floor whichFloor)
    {
        if (currentFloor==whichFloor)
            System.out.println("ZATEN AYNI KATTASINIZ");

        int  compare = currentFloor.compareTo(whichFloor);
        while(compare!=0)
        {
            if (compare<0)
            {
             goUp();
            }
            else goDown();
        compare= currentFloor.compareTo(whichFloor);
        }
        stopped=true;
        System.out.println("İstediğiniz Kata Geldiniz Kapılar Açılıyor");
        openDoors=true;

    }
    private void goUp()
    {
        if (openDoors)closeDoor();

        if (currentFloor.compareTo(topFloor)<0)
        {
            System.out.println("Yukarı Çıkılıyor");
            currentFloor=currentFloor.increaseFloor();
            System.out.println(currentFloor);
        }
        else
            System.out.println("ZATEN ÜST KATTA");
        stopped=true;
    }
    private void goDown()
    {

        if (openDoors)closeDoor();

        if (currentFloor.compareTo(bottomFlor)>0)
        {
            System.out.println("Aşşağıya  İniliyor");
            currentFloor=currentFloor.decrease();
            System.out.println(currentFloor);
        }
        stopped=true;
    }

    @Override
    public void openDoor()
    {
        openDoors=true;
    }

    @Override
    public void closeDoor()
    {
        openDoors=false;
    }




    private Floor getCurrentFloor() {
        return currentFloor;
    }
    public void getCurrentFloorPublic()
    {
        System.out.println("ŞU ANDA BULUNDUĞUNUZ KAT "+getCurrentFloor());
    }
}
