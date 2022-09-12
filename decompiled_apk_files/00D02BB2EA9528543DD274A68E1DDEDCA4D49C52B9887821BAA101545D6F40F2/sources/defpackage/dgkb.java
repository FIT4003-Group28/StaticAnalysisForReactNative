package defpackage;
/* compiled from: PG */
/* renamed from: dgkb  reason: default package */
/* loaded from: classes6.dex */
public final class dgkb extends dsqw<dgkb, dgjy> implements dssk {
    public static final dgkb e;
    private static volatile dssr<dgkb> g;
    public String a = "";
    public String b = "";
    public int c;
    public boolean d;
    private int f;

    static {
        dgkb dgkbVar = new dgkb();
        e = dgkbVar;
        dsqw.cc(dgkb.class, dgkbVar);
    }

    private dgkb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဇ\u0003", new Object[]{"f", "a", "b", "c", dgka.c(), "d"});
            }
            if (i2 == 3) {
                return new dgkb();
            }
            if (i2 == 4) {
                return new dgjy();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgkb> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dgkb.class) {
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
