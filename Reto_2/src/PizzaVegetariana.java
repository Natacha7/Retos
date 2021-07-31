class PizzaVegetariana extends Pizza {
    private String vegetal;
    private double precioBase;

    public void setVegetal(String vegetal){
        this.vegetal = vegetal;
    }
    public String getVegetal(){
        return this.vegetal;
    }
    
    public PizzaVegetariana(String tamano, boolean quesoExtra, String vegetal){
        if (tamano != "") {
            this.tamano = tamano;
        } else {
            this.tamano = TAMANO;
        }
        if (quesoExtra == true) {
            this.quesoExtra = quesoExtra;
        } else {
            this.quesoExtra = QUESO_EXTRA;
        }

            this.precioBase = PRECIO_BASE;
            this.vegetal = vegetal;
    }

    public double calcularPrecio(){
        double precioPizza = 0;
        double precioGeneral = 0;
        int valorTamano = 0;
        double otroIngrediente = 0;
        double precioVegetal = 0;

        if(this.tamano == "Personal"){
            valorTamano = 1;
        }
        if(this.tamano == "Familiar"){
            valorTamano = 2;
        }
        if(this.otroIngrediente == "Champiñones"){
            otroIngrediente = 2000;
        }
        if(this.otroIngrediente == "Jalapeños"){
            otroIngrediente = 3000;
        }
        if(this.vegetal == "Tomate"){
            precioVegetal = 5000;
        }
        if(this.vegetal == "Aceituna"){
            precioVegetal = 4000;
        }
        precioGeneral = this.precioBase * valorTamano + otroIngrediente;
        precioPizza = precioGeneral + precioVegetal;
        return precioPizza;
    }
}
