public class FibNum {
    public static void main(String[] args) {
        fib(31);
    }

    static int fib(int base) {
        int result=0;
        if(base <= 1){
            result = base;
        } else{
            int i =2;
            int f0 = 0;
            int f1 = 1;

            while(i <= base){
                result = f0 + f1;
                f0=f1;
                f1=result;
                i +=1;
            }
        }

        System.out.print(result);
        return result;
    }
}