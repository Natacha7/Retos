public class App {
    public static void main(String[] args) throws Exception {
        Pizza listaPizzas[] = new Pizza[4];
        listaPizzas[0] = new Pizza("", true);
        listaPizzas[1] = new PizzaCarnes("Personal", false, "Jamón");
        listaPizzas[1].agregarOtroIngrediente("Champiñones");
        listaPizzas[2] = new PizzaVegetariana("Personal", true, "Aceituna");
        listaPizzas[3] = new PizzaCarnes("Familiar",true,"Salami");
        Carrito nuevoPedido = new Carrito(listaPizzas);
        System.out.println(nuevoPedido.mostrarTotales());

    }
}
