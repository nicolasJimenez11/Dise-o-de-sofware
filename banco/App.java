public class App {
    public static void main(String[] args) throws Exception {
        Ahorro dueno1 = new Ahorro(331222145, "nicolas JImenez");
        Ahorro dueno2 = new Ahorro(765432223, "david lopez");

        dueno1.deposito(5000);
        dueno2.deposito(60000);

        System.out.println(dueno1.toString());
        System.out.println(dueno2.toString());
    }
}
