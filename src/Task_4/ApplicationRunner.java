package Task_4;


import Task_4.UniqueName.UniqueName;

public class ApplicationRunner {
    public static void main(String[] args) {

        UniqueName.UniqueNames uniqueNames = new UniqueName.UniqueNames();
        uniqueNames.addName("Bogdan");
        uniqueNames.addName("Kate");
        uniqueNames.addName("Oleg");
        uniqueNames.addName("Kirill");
        uniqueNames.addName("Flaffic");
        uniqueNames.addName("Rita");
        uniqueNames.addName("Ilya");
        uniqueNames.addName("Dmitry");
        uniqueNames.addName("Vlad");
        uniqueNames.addName("Igor");
        uniqueNames.addName("Sergey");
        uniqueNames.addName("Dmitry");
        uniqueNames.addName("Daniil");
        uniqueNames.addName("Sultan");
        uniqueNames.addName("Marina");
        uniqueNames.addName("Andrew");

        System.out.println("Unique names in a group:");
        for (String name : uniqueNames.getNames()) {
            System.out.println(name);



                }
            }
        }



