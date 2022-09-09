public class DigitalRoot {

  public static int digital_root(int n) {

    if(n >= 10)     //If more than one digit
        return digital_root(digital_root(n/10) + n%10);
    else if(n >= 0) //If one digit
        return n;
    else
        throw new IllegalArgumentException();
        
  }
  
}