package ejercicioTemp;

import java.util.ArrayList;
import java.util.List;

public class Register {

  private List<Temperature> lTemperature;
  private int min;
  private int max;
  
  public Register() {
    this.lTemperature = new ArrayList<Temperature>();
    this.min = -1;
    this.max = -1;
  }

  public void addRegister(String country, short min, short max) {
    Temperature temp = new Temperature(country, min, max);
    lTemperature.add(temp);
    
    if (this.compareTempMin(temp)) {
      this.min = lTemperature.size() -1;
    }else if (this.compareTempMax(temp)) {
      this.max = lTemperature.size() -1;
    }
  }

  public void addRegister(Temperature temp) {
    boolean  isMin = this.compareTempMin(temp);
    boolean isMax = this.compareTempMax(temp);

    lTemperature.add(temp);
    
    if (isMin) {
      this.min = lTemperature.size() -1;
    }
    if (isMax) {
      this.max = lTemperature.size() -1;
    }


  }

  public Temperature getMinRegiter() {
    if (this.min != -1 ){
      return this.lTemperature.get(this.min);
    }
    return null;
  }

  public Temperature getMaxRegiter() {
    if (this.max != -1 ){
      return this.lTemperature.get(this.max);
    }
    return null;
  }

  private boolean compareTempMin(Temperature temp){
    Temperature min = this.getMinRegiter();
    
    if(min != null){
      if (min.getMinTemp() < temp.getMinTemp()) {
        return false;
      }
    }
    return true;
  }

  private boolean compareTempMax(Temperature temp){
    Temperature max = this.getMaxRegiter();
    
    if(max!= null){
      if (max.getMaxTemp() > temp.getMaxTemp()) {
        return false;
      }
    }
    return true;
  }
  
}