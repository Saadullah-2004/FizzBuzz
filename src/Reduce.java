
public class Reduce {

    public static void main(String[] args) {
        System.out.println(main(100));
    }

    public static int main(int n) {
        int count = 0;
        while (n > 0){
            count++;
            if (n % 2 == 0){
                n = n / 2;
            }
            else{
                n = n - 1;
            }
        }
        return count;
    }


}
