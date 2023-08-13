package ch1;

public abstract class Shish {
    abstract boolean onlyOnions();
    abstract boolean isVegetarian();
}

class Skewer extends Shish {
    @Override
    boolean onlyOnions() {
        return true;
    }

    @Override
    boolean isVegetarian() {
        return true;
    }
}

class Onion extends Shish {
    Shish s;
    Onion(Shish _s) {
        s = _s;
    }

    @Override
    boolean onlyOnions() {
        return s.onlyOnions();
    }

    @Override
    boolean isVegetarian() {
        return s.isVegetarian();
    }
}

class Lamb extends Shish {
    Shish s;
    Lamb(Shish _s) {
        s = _s;
    }

    @Override
    boolean onlyOnions() {
        return false;
    }

    @Override
    boolean isVegetarian() {
        return false;
    }
}

class Tomato extends Shish {
    Shish s;
    Tomato(Shish _s) {
        s = _s;
    }

    @Override
    boolean onlyOnions() {
        return false;
    }

    @Override
    boolean isVegetarian() {
        return s.isVegetarian();
    }
}
