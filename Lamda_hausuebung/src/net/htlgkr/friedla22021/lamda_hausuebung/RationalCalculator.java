package net.htlgkr.friedla22021.lamda_hausuebung;

public class RationalCalculator extends AbstractCalculator {

    public RationalCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        super(

                (x, y) -> {
                    Number result = new Number();
                    double zaehler = (x.getA() * y.getB()) + (x.getB() * y.getA());
                    double nenner = x.getB() * y.getB();
                    result.setA(zaehler);
                    result.setB(nenner);
                    return result;
                },

                (x, y) -> {
                    Number result = new Number();
                    double zaehler = (x.getA() * y.getB()) - (x.getB() * y.getA());
                    double nenner = x.getB() * y.getB();
                    result.setA(zaehler);
                    result.setB(nenner);
                    return result;
                },

                (x, y) -> {
                    Number result = new Number();
                    result.setA(x.getA() * y.getA());
                    result.setB(x.getB() * y.getB());
                    return result;
                },

                (x, y) -> {
                    Number result = new Number();
                    result.setA(x.getA() * y.getB());
                    result.setB(x.getB() * y.getA());
                    return result;
                }
        );   }

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
