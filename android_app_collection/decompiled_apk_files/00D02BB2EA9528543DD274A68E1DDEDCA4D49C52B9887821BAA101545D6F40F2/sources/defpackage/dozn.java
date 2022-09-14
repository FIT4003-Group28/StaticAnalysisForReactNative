package defpackage;
/* compiled from: PG */
/* renamed from: dozn  reason: default package */
/* loaded from: classes6.dex */
public final class dozn extends dsqw<dozn, dozm> implements dssk {
    public static final dozn f;
    private static volatile dssr<dozn> g;
    public int a;
    public int b;
    public int c;
    public boolean d;
    public String e = "";

    static {
        dozn doznVar = new dozn();
        f = doznVar;
        dsqw.cc(dozn.class, doznVar);
    }

    private dozn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dozn();
            }
            if (i2 == 4) {
                return new dozm();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dozn> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dozn.class) {
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
