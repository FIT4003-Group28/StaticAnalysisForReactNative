package defpackage;
/* compiled from: PG */
/* renamed from: dkhl  reason: default package */
/* loaded from: classes6.dex */
public final class dkhl extends dsqw<dkhl, dkhk> implements dssk {
    public static final dkhl e;
    private static volatile dssr<dkhl> g;
    public boolean a;
    public int b;
    public boolean c;
    public boolean d;
    private int f;

    static {
        dkhl dkhlVar = new dkhl();
        e = dkhlVar;
        dsqw.cc(dkhl.class, dkhlVar);
    }

    private dkhl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dkhl();
            }
            if (i2 == 4) {
                return new dkhk();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkhl> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dkhl.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
