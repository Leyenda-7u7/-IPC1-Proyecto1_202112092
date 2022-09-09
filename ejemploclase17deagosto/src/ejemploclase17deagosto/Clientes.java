
package ejemploclase17deagosto;


public class Clientes {
    //Atributos
    private String CUI;
    private String nombre;
    private String apellido;
    private Cuen[] cuentas = new Cuen[5];
    public int contador=0;
    //Metodo
    public Clientes (String CUI, String nombre, String apellido){
          this.nombre = nombre;
          this.apellido = apellido;
          this.CUI = CUI;
    } // fin de public clientes
    public String getCUI(){
        return CUI;
    }
    public String getnombre(){
        return nombre;
    }
    public String getapellido(){
        return apellido;
    }
    public void setcuentas(Cuen cuentas){
        this.cuentas[contador]=cuentas;
        contador++;
    }
}//fin de mi codigo
