package defpackage;
/* compiled from: PG */
/* renamed from: amyx  reason: default package */
/* loaded from: classes.dex */
public final class amyx extends dsqw<amyx, amyw> implements dssk {
    public static final amyx f;
    private static volatile dssr<amyx> g;
    public int a;
    public amyv b;
    public String c = "";
    public long d;
    public long e;

    static {
        amyx amyxVar = new amyx();
        f = amyxVar;
        dsqw.cc(amyx.class, amyxVar);
    }

    private amyx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new amyx();
            }
            if (i2 == 4) {
                return new amyw();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<amyx> dssrVar = g;
            if (dssrVar == null) {
                synchronized (amyx.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
