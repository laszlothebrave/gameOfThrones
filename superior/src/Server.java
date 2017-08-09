

public class Server {
    public static void main(String[] args) {
        System.out.println("Server - OK");
        Network network = new Network();
        new Thread(network).start();
        Engine engine =  new Engine(network);
        new Thread(engine).start();

    }
}
