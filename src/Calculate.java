public class Calculate {
    int sum(int a, int b){
        return a+b;
    }

    int diff(int a, int b){
        return a-b;
    }

    int div(int a, int b){
        if(b==0)
            throw new ArithmeticException();
        return a/b;
    }

    int mul(int a,int b){
        return a*b;
    }

}
