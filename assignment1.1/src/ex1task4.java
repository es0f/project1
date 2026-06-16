public class ex1task4 {
    private String name;

    public ex1task4(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        // Create an instance of the Cat class with a name
        ex1task4 cat = new ex1task4("Whiskers");

        ex1task4 cat2 = new ex1task4("Rex");

        // Call the meow method on the cat instance
        cat.meow();
        cat.meow();
        cat2.meow();
        cat.meow();
    }
}



