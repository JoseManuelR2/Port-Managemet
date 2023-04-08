package puerto;

public class main {
    //test hub(ya no funciona porque he borrado el constructo Contenedor(id))
    public static void main(String[] args) {
        Hub h = new Hub();
        for (int i = 0; i < 100; i++) {
            //h.apilar(new Contenedor(i));
        }
        h.desapilar(4);
        System.out.println(h);

    }
}