package defpackage;
/* compiled from: PG */
/* renamed from: duzn  reason: default package */
/* loaded from: classes6.dex */
public final class duzn extends dsqw<duzn, duzm> implements dssk {
    public static final duzn e;
    private static volatile dssr<duzn> g;
    public dngs a;
    public boolean b;
    public int c;
    public boolean d;
    private int f;

    static {
        duzn duznVar = new duzn();
        e = duznVar;
        dsqw.cc(duzn.class, duznVar);
    }

    private duzn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0004င\u0003\u0005ဇ\u0004", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new duzn();
            }
            if (i2 == 4) {
                return new duzm();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duzn> dssrVar = g;
            if (dssrVar == null) {
                synchronized (duzn.class) {
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
