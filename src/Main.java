public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int abs1 = calc.abs.apply(-32);
        int abs2 = calc.abs.apply(8);
        int p = calc.pow.apply(6);
        int m = calc.multiply.apply(5,9);
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        Double c = calc.devide.apply(6.0, 4.0);
        Boolean s = calc.isPositive.test(-8);
        System.out.println(s);
        calc.println.accept(abs1);
        calc.println.accept(abs2);
        calc.println.accept(m);
        calc.println.accept(p);
        calc.println.accept(a);
        calc.println.accept(b);
        System.out.println(c);
    }
}
