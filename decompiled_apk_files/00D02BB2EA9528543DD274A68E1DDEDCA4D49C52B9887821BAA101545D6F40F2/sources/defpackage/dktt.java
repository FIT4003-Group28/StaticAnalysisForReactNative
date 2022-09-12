package defpackage;
/* compiled from: PG */
/* renamed from: dktt  reason: default package */
/* loaded from: classes.dex */
public final class dktt extends dsqw<dktt, dktq> implements dssk {
    private static volatile dssr<dktt> B;
    public static final dktt z;
    private int A;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean p;
    public boolean q;
    public boolean s;
    public boolean t;
    public dkts u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int a = 2000;
    public int b = 2000;
    public int c = 200000;
    public int g = 3;
    public int m = 60;
    public int n = 60;
    public int o = 60;
    public dsrf r = dsqz.b;

    static {
        dktt dkttVar = new dktt();
        z = dkttVar;
        dsqw.cc(dktt.class, dkttVar);
    }

    private dktt() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(z, "\u0001\u0019\u0000\u0001\u0001\u0085\u0019\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002dဇ\u0003gဇ\u0006hဇ\u0007iင\bjဇ\tkဇ\nlဇ\u000bmဇ\u0011nဇ\u0012qဇ\u0015sင\u000etင\u000fuင\u0010vဇ\fwဇ\rxဇ\u0017zဉ\u0019}\u0016\u0081ဇ\u001b\u0082ဇ\u001c\u0083ဇ\u001d\u0085ဇ\u001f", new Object[]{"A", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "p", "q", "s", "m", "n", "o", "k", "l", "t", "u", "r", "v", "w", "x", "y"});
            }
            if (i2 == 3) {
                return new dktt();
            }
            if (i2 == 4) {
                return new dktq();
            }
            if (i2 == 5) {
                return z;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dktt> dssrVar = B;
            if (dssrVar == null) {
                synchronized (dktt.class) {
                    dssrVar = B;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(z);
                        B = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
