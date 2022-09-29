import org.checkerframework.checker.dividebyzero.qual.*;

class Bar {

    public static void f() {
        int one  = 1;
        int zero = 0;
	// :: error: divide.by.zero
	int x = one % zero;
	int y = one;
	// :: error: divide.by.zero
	y %= zero;
    }

}
