package defpackage;
/* compiled from: PG */
/* renamed from: par  reason: default package */
/* loaded from: classes7.dex */
public final class par extends dsqw<par, paq> implements dssk {
    public static final par d;
    private static volatile dssr<par> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        par parVar = new par();
        d = parVar;
        dsqw.cc(par.class, parVar);
    }

    private par() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဈ\u0000\u0004ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new par();
            }
            if (i2 == 4) {
                return new paq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<par> dssrVar = e;
            if (dssrVar == null) {
                synchronized (par.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
