class PizzaCarnes extends Pizza {
    private String carne;

    public void setCarne(String carne){
        this.carne = carne;
    }

    public String getCarne(){
        return this.carne;
    }

    public PizzaCarnes(String tamano, boolean quesoExtra, String carne){
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
            this.carne = carne;
    }

    public double calcularPrecio(){
        double precioPizza = 0;
        double precioGeneral = 0;
        int valorTamano = 0;
        double otroIngrediente = 0;
        double precioCarne = 0;

        if (this.tamano == "Personal"){
            valorTamano = 1;
        } 
        if (this.tamano == "Familiar"){
            valorTamano = 2;
        }
        if (this.otroIngrediente == "Champiñones"){
            otroIngrediente = 2000;
        }
        if (this.otroIngrediente == "Jalapeños"){
            otroIngrediente = 3000;
        }
        if (this.carne == "Salami"){
            precioCarne = 8000; 
        }
        if (this.carne == "Jamón"){
            precioCarne = 6000;
        }
        if (this.carne == "Pollo"){
            precioCarne = 5000;
        }
        precioGeneral=this.precioBase* valorTamano + otroIngrediente;
        precioPizza = precioGeneral + precioCarne;
        return precioPizza;
    }
}
