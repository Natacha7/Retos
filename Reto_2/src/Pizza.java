public class Pizza {
    protected static final String TAMANO = "Personal";
    protected static final boolean QUESO_EXTRA = false;
    protected static final double PRECIO_BASE = 6000;

    protected String tamano;
    protected boolean quesoExtra;
    protected String otroIngrediente;
    protected double precioBase;

    public Pizza(){
    }
    
    public Pizza(String tamano, boolean quesoExtra) {
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
            
    }

    public void setTamano(String tamano){
        this.tamano = tamano;
    }

    public void setQuesoExtra(boolean quesoExtra){
        this.quesoExtra = quesoExtra;
    }

    public void setPrecioBase(double precioBase){
        this.precioBase = precioBase;
    }

    public void setOtroIngrediente(String otroIngrediente){
        this.otroIngrediente = otroIngrediente;
    }

    public String getTamano() {
        return this.tamano;
    }

    public boolean getQuesoExtra() {
        return this.quesoExtra;
    }

    public double getPrecioBase() {
        return this.precioBase;
    }

    public String getOtroIngrediente() {
        return this.otroIngrediente;
    }

    public void agregarOtroIngrediente(String otroIngrediente) {
        this.otroIngrediente = otroIngrediente;
        
    }

    public double calcularPrecio() {
        double precioGeneral = 0;
        int valorTamano = 0;
        double otroIngrediente = 0;

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

        precioGeneral=this.precioBase*valorTamano + otroIngrediente;
        return precioGeneral;
    }
}

