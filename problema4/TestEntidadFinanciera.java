class Banco{
    private String nombreBanco;
    private int numeroSucursales;

    public Banco(String nombreBanco, int numeroSucursales) {
        this.nombreBanco = nombreBanco;
        this.numeroSucursales = numeroSucursales;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public int getNumeroSucursales() {
        return numeroSucursales;
    }

    public void setNumeroSucursales(int numeroSucursales) {
        this.numeroSucursales = numeroSucursales;
    }

    public String toString(){
        return String.format("%s"+
                "\nNumero Sucursales: %d",getNombreBanco(),getNumeroSucursales());
    }
}

class Cheque {
    private String nombreCliente;
    private double valorCheque;
    private Banco banco;
    private double comisionBanco;

    public Cheque(String nombreCliente, double valorCheque, Banco banco) {
        this.nombreCliente = nombreCliente;
        this.valorCheque = valorCheque;
        this.banco = banco;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void calcularComisionBanco() {
        this.comisionBanco = 0.00003 * this.getValorCheque();
    }

    public double getComisionBanco() {
        return comisionBanco;
    }

    public String toString() {
        return String.format("DATOS"+
                "\nNombre Banco: %s"+
                "\nNombre Cliente: %s"+
                "\nValor del Cheque: %.2f"+
                "\nComision del Banco: %.2f",
                this.getBanco(),this.getNombreCliente(),this.getValorCheque(),this.getComisionBanco());
    }
}
public class TestEntidadFinanciera {
    public static void main(String[] args) {
        Banco banco= new Banco("BanLoja",4);
        Cheque cheque=new Cheque("Iam",12000,banco);
        cheque.calcularComisionBanco();
        System.out.print(cheque);
    }
}
