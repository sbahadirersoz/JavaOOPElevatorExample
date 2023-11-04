public enum Floor
{
ZERO(0),FIRST(1),SECOND(2),THIRD(3),FOURTH(4);

private  int floorInt;
    private Floor (int floorInt)
{this.floorInt=floorInt;}
int getIntFloor()
{
    return floorInt;
}
    public int getFloorInt() {
        return floorInt;
    }
    Floor increaseFloor()
{
 Floor upperFloor=null;
    if(this==ZERO) upperFloor=FIRST;
    else if (this==FIRST) upperFloor=SECOND;
    else if (this==SECOND) upperFloor=THIRD;
    else if (this==THIRD) upperFloor=FOURTH;
        return upperFloor;
    }
    Floor decrease()
    {
        Floor lowerFloor = null;
        if(this==FOURTH) lowerFloor=THIRD;
        else if (this==THIRD) lowerFloor=SECOND;
        else if (this==SECOND) lowerFloor=FIRST;
        else if (this==FIRST) lowerFloor=ZERO;
        return lowerFloor;
    }
}
