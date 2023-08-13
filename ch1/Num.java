package ch1;

public class Num {
    public static void main(String[] args) {

    }
}

class Zero extends Num {}

class OneMoreThan extends Num {
    Num predecessor;
    OneMoreThan(Num _p) {
        predecessor = _p;
    }
}
