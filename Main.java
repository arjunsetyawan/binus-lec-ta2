public class Main {
    public static void main(String[] args) {
        Antrian queue = new Antrian();
        queue.push("Pelanggan 1");
        queue.push("Pelanggan 2");
        queue.push("Pelanggan 3");
        queue.pop();
        queue.pop();
        queue.pop();
    }
}
