
/** 
 * Tipo de dato abstracto para representar un contador
 */
public class Contador{

  /**
   * Nombre del contador
   */
  private String id;

  /**
   * Valor actual del contador
   */
  private int valor;

  /*
   * Crea un contador llamado id, con el valor incial 0
   */
  public Contador(String id)
  {
    this.valor = 0;
  }

  /**
   * Incrementa el contador en uno
   */
  public void incrementar(){
    valor++;
  }

  /**
   * Retorna el numero de incrementos desde su creacion
   */
  public int incrementos(){
    return valor;
  }

  /**
   * Retorna la representacion del contador en cadena de caracteres
   */
  public String toString(){
    String str = "";
    for(int i = 0; i <= valor; i++)
      str += Integer.toString(valor) + " ";
      return str;
    }

}           
