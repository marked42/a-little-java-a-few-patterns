package ch1;

public abstract class Pizza {
    abstract Pizza removeAnchovy();
    abstract Pizza topAnchovyWithCheese();
    abstract Pizza substituteAnchovyByCheese();
}

class Crust extends Pizza {
    @Override
    Pizza removeAnchovy() {
        return new Crust();
    }

    @Override
    Pizza topAnchovyWithCheese() {
        return new Crust();
    }

    @Override
    Pizza substituteAnchovyByCheese() {
        return new Crust();
    }
}

class Cheese extends Pizza {
    Pizza p;
    Cheese(Pizza _p) {
        p = _p;
    }

    @Override
    Pizza removeAnchovy() {
        return new Cheese(p.removeAnchovy());
    }

    @Override
    Pizza topAnchovyWithCheese() {
        return new Cheese(p.topAnchovyWithCheese());
    }

    @Override
    Pizza substituteAnchovyByCheese() {
        return new Cheese(p.substituteAnchovyByCheese());
    }
}

class Olive extends Pizza {
    Pizza p;
    Olive(Pizza _p) {
        p = _p;
    }

    @Override
    Pizza removeAnchovy() {
        return new Olive(p.removeAnchovy());
    }

    @Override
    Pizza topAnchovyWithCheese() {
        return new Olive(p.topAnchovyWithCheese());
    }

    @Override
    Pizza substituteAnchovyByCheese() {
        return new Olive(p.substituteAnchovyByCheese());
    }
}

class Anchovy extends Pizza {
    Pizza p;
    Anchovy(Pizza _p) {
        p = _p;
    }

    @Override
    Pizza removeAnchovy() {
        return p.removeAnchovy();
    }

    @Override
    Pizza topAnchovyWithCheese() {
        return new Cheese(new Anchovy(p.topAnchovyWithCheese()));
    }

    @Override
    Pizza substituteAnchovyByCheese() {
        return new Cheese(p.substituteAnchovyByCheese());
    }
}

class Sausage extends Pizza {
    Pizza p;
    Sausage(Pizza _p) {
        p = _p;
    }

    @Override
    Pizza removeAnchovy() {
        return new Sausage(p.removeAnchovy());
    }

    @Override
    Pizza topAnchovyWithCheese() {
        return new Sausage(p.topAnchovyWithCheese());
    }

    @Override
    Pizza substituteAnchovyByCheese() {
        return new Sausage(p.substituteAnchovyByCheese());
    }
}

class Spinach extends Pizza {
    Pizza p;
    Spinach(Pizza _p) {
        p = _p;
    }

    @Override
    Pizza removeAnchovy() {
        return new Spinach(p.removeAnchovy());
    }

    @Override
    Pizza topAnchovyWithCheese() {
        return new Spinach(p.topAnchovyWithCheese());
    }

    @Override
    Pizza substituteAnchovyByCheese() {
        return new Spinach(p.substituteAnchovyByCheese());
    }
}
