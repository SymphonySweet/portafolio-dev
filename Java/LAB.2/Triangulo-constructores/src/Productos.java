public class Productos {
    private String codigo;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;


    public Productos(String codigo, String descripcion, int cantidad, double precioUnitario) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }


    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public double getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(double precioUnitario) { this.precioUnitario = precioUnitario; }


    public double calcularPrecioTotal() {
        return cantidad * precioUnitario;
    }

    public double calcularIGV() {
        return calcularPrecioTotal() * 0.18;
    }

    public double calcularTotal() {
        return calcularPrecioTotal() + calcularIGV();
    }

    public static void main(String[] args) {
        Productos p1 = new Productos("A001", "Celular Samsung S25", 2, 4000);
        System.out.println("Código: " + p1.getCodigo());
        System.out.println("Descripción: " + p1.getDescripcion());
        System.out.println("Cantidad: " + p1.getCantidad());
        System.out.println("Precio Unitario: " + p1.getPrecioUnitario());
        System.out.println("Subtotal: " + p1.calcularPrecioTotal());
        System.out.println("IGV: " + p1.calcularIGV());
        System.out.println("Total a pagar: " + p1.calcularTotal());
    }
}
