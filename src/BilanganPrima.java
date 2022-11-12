public class BilanganPrima {
    int[] prima = new int[49];

    BilanganPrima() {
        int bilangan = 2, totalRecord = 0;
        do {
            if (this.isPrima(bilangan)) {
                this.prima[totalRecord] = bilangan;
                totalRecord = totalRecord + 1;
            }
            bilangan = bilangan + 1;
        } while (totalRecord < this.prima.length);
    }

    public void getPrima() {
        for (int i = 0; i < (prima.length + 1); i++) {
            if (i >= 30) {
                System.out.print((i + 1) + "  ");
            } else {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < prima.length; i++) {
            System.out.print(prima[i] + " ");
        }
    }

    public int totalRecord() {
        int sum = 0;
        for (int i = 0; i < prima.length; i++) {
            sum = sum + prima[i];
        }
        return sum;
    }

    public double rataRataRecord() {

        return this.totalRecord() / (prima.length+ 1);
    }

    private boolean isPrima(int bilangan) {
        int bil = 0;
        for (int i = 1; i < bilangan; i++) {
            if (bilangan % i == 0) {
                bil = bil + 1;
            }
            if (bil > 2) {
                return false;
            }
        }
        return true;
    }
}
