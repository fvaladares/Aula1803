import java.io.Serializable;

public class Budget implements Serializable {
    private int dia;
    private double valor;

    public Budget(int dia, double valor) {
        this.dia = dia;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Budget{" +
                "dia=" + dia +
                ", valor=" + valor +
                '}';
    }
}
