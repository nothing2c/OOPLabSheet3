public class Computer implements IDable{
    private String id;
    private String make;
    protected  Memory memory;

    public Computer(){
        this("No Make", "No Memory Type", 0);
    }

    public Computer(String make, String memType, int memSize){
        setMake(make);
        memory=(new Memory(memType, memSize));
    }

    public String toString(){
        return "Make: "+getMake()+memory.toString();
    }

    @Override
    public void setID(String id) {
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }
}
