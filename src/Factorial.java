public class Factorial {
    
    int[] factorial = new int[50];
    Factorial(){
        int num1 = 0, num2 = 1;
        int counter = 0;
        while (counter < 50) {
            factorial[counter] = num1;
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }
    public void getFibonanci() {
        for (int i = 0; i < factorial.length; i++) {
            System.out.print(factorial[i] + " ");
        }
    }
    
    public int totalRecord() {
        int sum = 0;
        for (int i = 0; i < factorial.length; i++) {
            sum = sum + factorial[i];
        }
        return sum;
    }

    public double rataRataRecord() {

        return this.totalRecord() / (factorial.length+ 1);
    }
}
