package ch5;

abstract public class PizzaPie {
    RemoveAnchovyVisitor rafn = new RemoveAnchovyVisitor();

    abstract PizzaPie removeAnchovy();
}

class Bottom extends PizzaPie {
    @Override
    PizzaPie removeAnchovy() {
        return rafn.forBottom();
    }
}

class Topping extends PizzaPie {
    Object t;
    PizzaPie r;

    Topping(Object _t, PizzaPie _r) {
        t = _t;
        r = _r;
    }

    @Override
    PizzaPie removeAnchovy() {
        return rafn.forTopping(t, r);
    }
}

abstract class Fish {
    public abstract boolean equals(Object o);
}

class Anchovy extends Fish {
    @Override
    public boolean equals(Object o) {
        return (o instanceof Anchovy);
    }
}

class Salmon extends Fish {
    public boolean equals(Object o) {
        return (o instanceof Anchovy);
    }
}
class Tuna extends Fish {
    public boolean equals(Object o) {
        return (o instanceof Anchovy);
    }
}

class RemoveAnchovyVisitor {
    PizzaPie forBottom() {
        return new Bottom();
    }

    PizzaPie forTopping(Object t, PizzaPie r) {
        if (new Anchovy().equals(t)) {
            return r.removeAnchovy();
        } else {
            return new Topping(t, r.removeAnchovy());
        }
    }
}
