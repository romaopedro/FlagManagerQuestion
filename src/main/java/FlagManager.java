import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class FlagManager {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;

    public FlagManager(boolean a, boolean b, boolean c, boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public boolean areAllFlagsOff() {
        return ((a ? 1 : 0) + (b ? 1 : 0) + (c ? 1 : 0) + (d ? 1 : 0)) == 0;
    }
}
