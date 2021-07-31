class Carrito {
    private double precioTotalPizzas;
    private double precioTotalPizzasCarne;
    private double precioTotalPizzasVegetariana;
    private Pizza listaPizzas[];

    public Carrito(){
        precioTotalPizzas = 0;
        precioTotalPizzasCarne = 0;
        precioTotalPizzasVegetariana = 0;
    }

    public Carrito(Pizza listaPizzas[]){
        this.listaPizzas = listaPizzas;
    }

    public void calcularTotales(){
        for (int i = 0; i < listaPizzas.length; i++){
            if (listaPizzas[i] instanceof Pizza){
                precioTotalPizzas += listaPizzas[i].calcularPrecio();
            }
            if (listaPizzas[i] instanceof PizzaCarnes){
                precioTotalPizzasCarne += listaPizzas[i].calcularPrecio();
            }
            if (listaPizzas[i] instanceof PizzaVegetariana){
                precioTotalPizzasVegetariana += listaPizzas[i].calcularPrecio();
            }
        }
        
    }

    public String mostrarTotales(){
        calcularTotales();
        String cadenaTotales = "El precio total de las pizzas es de "+precioTotalPizzas + "\nLa suma del precio de las pizzas de carne es de "+precioTotalPizzasCarne +"\nLa suma del precio de las pizzas vegetarianas es de "+precioTotalPizzasVegetariana;
        return cadenaTotales;
    }
        
}
