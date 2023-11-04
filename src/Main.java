
public class Main {
    public static void main(String[] args)
    {
        Elevator E= new Elevator();
        E.go(Floor.FOURTH);
        E.getCurrentFloorPublic();
        E.go(Floor.THIRD);
    }
}
