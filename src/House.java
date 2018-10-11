public class House {
    private String address, type;
    private float price;
    private Person owner;

    public House(){
        setAddress("No address specified");
        setType("No type specified");
        setPrice(0);
        setOwner(new Person("No owner specified"));
    }

    public House(String address, String type, float price, String name, int age, char gender){

        this.address = address;
        this.type = type;
        this.price = price;

        this.owner = new Person(name,age,gender);
    }

    public String toString(){
        return "Adress: "+getAddress()+"\nType: "+getType()+"\nPrice: "+getPrice()+"\nOwner: "+owner.getName()+"\n";
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }
}


