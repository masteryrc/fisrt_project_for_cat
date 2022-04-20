package yrc.hello;

public class Helloworld {
    private String string_hello_world = "hello world!";
    private static String string_hello_world_static = "hello world! (static)";
    public void print_hello_world(){
        System.out.println(string_hello_world);
    }
    public static void  print_hello_world_static(){
        System.out.println(string_hello_world_static);
    }
    public static void main(String[] args){
        Helloworld helloworld = new Helloworld();
        helloworld.print_hello_world();
        Helloworld.print_hello_world_static();
    }

}
