package ejemploclase17deagosto;

public class Cuen {
    //Atributos
    private int ID;
    private Clientes cliente;
    private double saldo;
    
    //Metodo
    public Cuen(int ID, Clientes cliente, double saldo){
          this.ID = ID;
          this.cliente = cliente;
          this.saldo = saldo;
    } // fin de public clientes
    public int getID(){
        return ID;
    }
    public Clientes getcliente(){
        return cliente;
    }
    public double getsaldo(){
        return saldo;
    }
    public void setsaldosuma(double saldo){
        this.saldo = this.saldo+saldo;
    }
    public void setsaldoresta(double saldo){
        this.saldo = this.saldo-saldo;
    }
}
