package defpackage;
/* compiled from: PG */
/* renamed from: dkfv  reason: default package */
/* loaded from: classes6.dex */
public final class dkfv extends dsqw<dkfv, dkfs> implements dssk {
    public static final dkfv f;
    private static volatile dssr<dkfv> g;
    public int a;
    public String b = "";
    public dkgf c;
    public dkgl d;
    public dkfu e;

    static {
        dkfv dkfvVar = new dkfv();
        f = dkfvVar;
        dsqw.cc(dkfv.class, dkfvVar);
    }

    private dkfv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဈ\u0000\u0004ဉ\u0003", new Object[]{"a", "c", "d", "b", "e"});
            }
            if (i2 == 3) {
                return new dkfv();
            }
            if (i2 == 4) {
                return new dkfs();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkfv> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dkfv.class) {
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
