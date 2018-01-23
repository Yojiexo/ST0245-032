/**
 * Tipo de dato abstracto para representar una fecha
 */
public class Fecha{
  
  private int mes;
  private int dia;
  private int anio;
  
  /**
   * Crea una fecha
   */
  public Fecha(int mes, int dia, int anio)
  {
    this.mes = mes;
    this.dia = dia;
    this.anio = anio;
  }
  
  /**
   * Mes
   */
  public int mes(){
    return this.mes;
  }
  
  /**
   * Dia
   */
  public int dia(){
    return this.dia;
  }
  
  /**
   * Anio
   */
  public int anio(){
    return this.anio;
  }

  /**
   * Representacion en String
   */
  public String toString(){
    return dia + " de " + mes + " de " + anio;
  }
  
  /**
   * Es esta la misma fecha que esa?
   */
  public boolean equals(Fecha that){
    if(dia == this.dia && mes == this.mes && anio == this.anio) return true;
    else return false;
  }

  /**
   * Compara esta fecha y esa
   */
  public int compareTo(Fecha that){
    if  (this.dia < dia || this.mes < mes || this.anio < anio) {
    		System.out.println("La fecha es antigua");
    } else if(this.dia > dia || this.mes > mes || this.anio > anio ) {
    	System.out.println("La fecha es futura");
    } else {
    	System.out.println("Fecha actual");
    }
    return 0; 
  }
}