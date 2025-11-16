package folderr1;

public abstract class Elemento implements Imprimible {
    protected String etiqueta;

    public Elemento(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public String obtenerTexto() {
        return etiqueta;
    }
}
