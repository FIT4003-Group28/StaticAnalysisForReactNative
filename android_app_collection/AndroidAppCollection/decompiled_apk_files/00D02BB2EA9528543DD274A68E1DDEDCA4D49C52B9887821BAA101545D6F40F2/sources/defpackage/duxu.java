package defpackage;
/* compiled from: PG */
/* renamed from: duxu  reason: default package */
/* loaded from: classes.dex */
public final class duxu extends dsqw<duxu, duxr> implements dssk {
    public static final duxu e;
    private static volatile dssr<duxu> g;
    public duxt a;
    public boolean b;
    public boolean c;
    public boolean d;
    private int f;

    static {
        duxu duxuVar = new duxu();
        e = duxuVar;
        dsqw.cc(duxu.class, duxuVar);
    }

    private duxu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\t\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0006ဇ\u0005\u0007ဇ\u0006\tဇ\b", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new duxu();
            }
            if (i2 == 4) {
                return new duxr();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duxu> dssrVar = g;
            if (dssrVar == null) {
                synchronized (duxu.class) {
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
