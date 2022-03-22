public class BitInversion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] revbin = new int[6];
    int[] bin = new int[6];
    int quotient = 0;
    int remainder = 0;
    int i = 0;
    
    System.out.print("Input random number between 16 ~ 31 : ");
    int dec = input.nextInt();
    
    do {
      quotient = (int)dec/2;
      remainder = dec - quotient*2;
      
      i += 1;
      revbin[i] = remainder;
      
      dec = quotient;
    } while(quotient != 0);
    
    System.out.print("Decimal to Binary of chosen number : ");
    for(int m = 0; m < revbin.length; m++) {
      int temp = revbin[m];
      bin[m] = revbin[revbin.length-m-1];
      revbin[m] = temp;
      
      System.out.print(bin[m] + " ");
    }
    
    System.out.println();
    
    System.out.print("Inversion of the Binary number : ");
    for(int m = 0; m < bin.length; m++) {
      if(bin[m] == 0)
        bin[m] = 1;
      else
        bin[m] = 0;
      
      System.out.print(bin[m] + " ");
    }
  }
  
