package ejercicioTemp;
public class Temperature {
  private String country;
  private short minTemp;
  private short maxTemp;
  
  public Temperature (String country, short min, short max) {
    this.country= country;
    this.minTemp = min;
    this.maxTemp = max;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public short getMinTemp() {
    return minTemp;
  }

  public void setMinTemp(short minTemp) {
    this.minTemp = minTemp;
  }

  public short getMaxTemp() {
    return maxTemp;
  }

  public void setMaxTemp(short maxTemp) {
    this.maxTemp = maxTemp;
  }
  


}


/**
 * 
 *  Vector lista de paises y en una matrix las temperaturas minimas y maximas 
 * 
 */