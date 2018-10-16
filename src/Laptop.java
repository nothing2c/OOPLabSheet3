public class Laptop extends Computer{
    private boolean touchScreen;

    public Laptop(){
        this("No Make","No type",0);
    }

    public Laptop(String make, String memType, int memSize){

    }

    public String toString(){
        if(touchScreen)
            return "\nHas a Touch Screen";
        else
            return "\nDoesn't Have a Touch Screen";
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public boolean getTouchScreen(){
        return touchScreen;
    }
}
