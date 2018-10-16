public class Memory extends Computer{
    private String type;
    private int size;

    public Memory(String type, int size){
        setType(type);
        setSize(size);
    }

    public Memory(){
        this("No Type",0);
    }

    public String toString(){
        return "\nType: "+getType()+"\nSize: "+getSize();
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
