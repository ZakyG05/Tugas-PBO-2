public class Binatang {
            public String name = "Alos";
            public int age = 6;
            public String furColor = "Black";

            public void getName() {
                System.out.println("My Dog Name is :  " + name);
            }
            public void getAge() {
                System.out.println("My Dog is " + age + "years old");
            }
            public void getFurcolor() {
                System.out.println("The fur color of my dog is " + furColor) ;
            }

            public static void main(String[] args) {
                Binatang dog = new Binatang();
                dog.getName();
                dog.getAge();
                dog.getFurcolor();

            }
    }
