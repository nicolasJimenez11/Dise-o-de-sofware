public class App {
    public static void main(String[] args) throws Exception {
        Ahorro dueno1 = new Ahorro(101254646, "nicolas JImenez");
        Ahorro dueno2 = new Ahorro(215632124, "david lopez");

        dueno1.deposito(5000);
        dueno2.deposito(60000);

        System.out.println(dueno1.toString());
        System.out.println(dueno2.toString());
    }
}
