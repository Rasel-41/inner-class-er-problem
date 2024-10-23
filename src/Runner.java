public class Runner {
    public static void main(String[] args) {
        Bag bag = new Bag();
        bag.add("apple");
        bag.add("banana");
        bag.add("apple");
        System.out.println("Apple count:"+bag.count("apple"));
        System.out.println("Banana count:"+bag.count("banana"));
        System.out.println("Orange count:"+bag.count("orange"));
    }
}
