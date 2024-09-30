package net.htlgkr.friedla22021.lamda_hausuebung;

public class ComplexCalculator extends AbstractCalculator {
    public ComplexCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        super(
                (x, y) -> {
                    Number result = new Number();
                    result.setA(x.getA() + y.getA());
                    result.setB(x.getB() + y.getB());
                    return result;
                },

                (x, y) -> {
                    Number result = new Number();
                    result.setA(x.getA() - y.getA());
                    result.setB(x.getB() - y.getB());
                    return result;
                },

                (x, y) -> {
                    Number result = new Number();
                    double realPart = x.getA() * y.getA() - x.getB() * y.getB();
                    double imaginaryPart = x.getA() * y.getB() + x.getB() * y.getA();
                    result.setA(realPart);
                    result.setB(imaginaryPart);
                    return result;
                },
                // Division zweier komplexer Zahlen
                //TODO
                (x, y) -> {
                    return x;
                }
        );
    }

    @Override
    public Number add(Number a, Number b) {
        return add.calc(a, b);
    }

    @Override
    public Number subtract(Number a, Number b) {
        return subtract.calc(a, b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        return multiply.calc(a, b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return divide.calc(a, b);
    }
}
