package folderr1;

public class StringElemento extends Elemento {
    public StringElemento(String texto) {
        super(texto);
    }

    @Override
    public String obtenerTexto() {
        return "Texto: " + etiqueta;
    }
}
