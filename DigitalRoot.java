public class DigitalRoot {

  public static int digital_root(int n) {
    if (n < 0)
      throw new IllegalArgumentException();

    int result;
    if(n/10 != 0) //If more than one digit
        {
            result =  digital_root(n/10) + n%10;

            if(result/10 !=0) //If more than one digit
                return digital_root(result);
            else
                return result;
        }
    else
        return n;
  }
  
}