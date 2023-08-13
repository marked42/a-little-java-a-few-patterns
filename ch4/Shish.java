package ch4;

public abstract class Shish {
    OnlyOnionVisitor oofn = new OnlyOnionVisitor();
    IsVegetarianVisitor ivfn = new IsVegetarianVisitor();

    abstract boolean onlyOnions();
    abstract boolean isVegetarian();
}

class OnlyOnionVisitor {
    boolean forSkewer() {
        return true;
    }

    boolean forOnion(Shish s) {
        return s.onlyOnions();
    }

    boolean forLamb(Shish s) {
        return false;
    }

    boolean forTomato(Shish s) {
        return false;
    }
}

class IsVegetarianVisitor {
    boolean forSkewer() {
        return true;
    }

    boolean forOnion(Shish s) {
        return s.isVegetarian();
    }

    boolean forLamb(Shish s) {
        return false;
    }

    boolean forTomato(Shish s) {
        return s.isVegetarian();
    }
}

class Skewer extends Shish {
    @Override
    boolean onlyOnions() {
        return oofn.forSkewer();
    }

    @Override
    boolean isVegetarian() {
        return ivfn.forSkewer();
    }
}

class Onion extends Shish {
    Shish s;
    Onion(Shish _s) {
        s = _s;
    }

    @Override
    boolean onlyOnions() {
        return oofn.forOnion(s);
    }

    @Override
    boolean isVegetarian() {
        return ivfn.forOnion(s);
    }
}

class Lamb extends Shish {
    Shish s;
    Lamb(Shish _s) {
        s = _s;
    }

    @Override
    boolean onlyOnions() {
        return oofn.forLamb(s);
    }

    @Override
    boolean isVegetarian() {
        return ivfn.forLamb(s);
    }
}

class Tomato extends Shish {
    Shish s;
    Tomato(Shish _s) {
        s = _s;
    }

    @Override
    boolean onlyOnions() {
        return oofn.forTomato(s);
    }

    @Override
    boolean isVegetarian() {
        return ivfn.forLamb(s);
    }
}
