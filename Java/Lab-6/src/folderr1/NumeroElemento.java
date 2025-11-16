package folderr1;

public class NumeroElemento extends Elemento {
    private int valor;

    public NumeroElemento(int valor) {
        super(String.valueOf(valor));
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int nuevoValor) {
        this.valor = nuevoValor;
        this.etiqueta = String.valueOf(nuevoValor);
    }

    @Override
    public String obtenerTexto() {
        return "Número: " + valor;
    }
}
