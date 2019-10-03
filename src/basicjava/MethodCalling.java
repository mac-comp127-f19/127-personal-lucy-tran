package basicjava;

public class MethodCalling {
    public static void freakOut(){
        System.out.println("AAAAAAAAa");
    }

    public static String sayHello(String name){
        //System.out.println("Hello, " + name + "!!");
        String lastHalfOfName = name.substring(2);
        return "Hello, " + name + lastHalfOfName +"!!";
    }

    public static void main(String[] args) { //Java will always look for the main method first
//        sayHello(Sally);
//        sayHello(Dolly);
//        sayHello(Lucy);
        String welcomeMessage = sayHello("Dolly");
        System.out.println(welcomeMessage);

        System.out.println(sayHello("Doll" + "y"));
        System.out.println(sayHello("Jo"));
        System.out.println(sayHello("J"));


    }
}
