package ch1;

public abstract class Layer {
    public static void main(String[] args) {

    }
}

class Base extends Layer {
    Object o;
    Base(Object _o) {
        o = _o;
    }
}

class Slice extends Layer {
    Layer l;
    Slice(Layer _l) {
        l = _l;
    }
}
