public class HouseTest {
    public static void main(String[] args) {

        House house1 = new House();
        House house2 = new House("Down the road", "Detatched", 50, "Jim", 45, 'g');

        System.out.println(house2.toString());
        System.out.println(house1.toString());

        house1.setAddress("ira");
        house1.setType("dfg");
        house1.setPrice(877777);
        house1.setOwner(new Person("rth",90,'f'));

        System.out.println(house2.toString());
        System.out.println(house1.toString());
    }
}
