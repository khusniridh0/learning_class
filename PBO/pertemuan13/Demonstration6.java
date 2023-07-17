class Demonstration6 {
    public static void main(String[] args) {
        System.out.println("*** Method overriding demonstration.***");
        ChildClass child0b = new ChildClass();
        child0b.doNotChangeMe();
        child0b.showMe(); //Will display the overridden method
    }
}