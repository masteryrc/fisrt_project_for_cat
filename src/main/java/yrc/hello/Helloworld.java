package yrc.hello;

public class Helloworld {
    private String string_hello_world = "hello world!";
    public void print_hello_world(){
        System.out.println(string_hello_world);
    }
    public static void main(String[] args){
        Helloworld helloworld = new Helloworld();
        helloworld.print_hello_world();
    }

}
