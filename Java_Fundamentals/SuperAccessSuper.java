// Using superclass to access superclass members

class SuperAccessSuper {
    // using super to overcome name hiding
    class A {
        int i;
    }

    // create a subclass by extending class A
    class B extends A {
        int i; // this i hides the i in class A

        B(int a, int b) {
            super.i = a; // this refers to the i in A
            i = b; // this refers to the i in B
        }
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}

class UseSuper {
    public static void main(String args[]) {
        B subOb = new B(1, 2);

        subOb.show();
    }
}

// this program would produce the following:
// i in superclass: 1;
// i in subclass: 2;