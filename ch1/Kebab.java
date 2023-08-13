package ch1;

public abstract class Kebab {
    abstract boolean isVeggie();
    abstract Object whatHolder();
}

class Holder extends Kebab {
    Object o;

    Holder(Object _o) {
        o = _o;
    }

    @Override
    boolean isVeggie() {
        return true;
    }

    @Override
    Object whatHolder() {
        return o;
    }
}

class Shallot extends Kebab {
    Kebab k;
    Shallot(Kebab _k) {
        k = _k;
    }

    @Override
    boolean isVeggie() {
        return k.isVeggie();
    }

    @Override
    Object whatHolder() {
        return k.whatHolder();
    }
}

class Shrimp extends Kebab {
    Kebab k;
    Shrimp(Kebab _k) {
        k = _k;
    }

    @Override
    boolean isVeggie() {
        return false;
    }

    @Override
    Object whatHolder() {
        return k.whatHolder();
    }
}

class Radish extends Kebab {
    Kebab k;
    Radish(Kebab _k) {
        k = _k;
    }

    @Override
    Object whatHolder() {
        return k.whatHolder();
    }

    @Override
    boolean isVeggie() {
        return k.isVeggie();
    }
}

class Pepper extends Kebab {
    Kebab k;
    Pepper(Kebab _k) {
        k = _k;
    }

    @Override
    Object whatHolder() {
        return k.whatHolder();
    }

    @Override
    boolean isVeggie() {
        return k.isVeggie();
    }
}

class Zucchini extends Kebab {
    Kebab k;
    Zucchini(Kebab _k) {
        k = _k;
    }

    @Override
    Object whatHolder() {
        return k.whatHolder();
    }

    @Override
    boolean isVeggie() {
        return k.isVeggie();
    }
}
