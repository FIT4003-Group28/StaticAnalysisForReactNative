package defpackage;
/* compiled from: PG */
/* renamed from: czha  reason: default package */
/* loaded from: classes5.dex */
public final class czha extends dsqw<czha, czgx> implements dssk {
    public static final czha f;
    private static volatile dssr<czha> g;
    public int a;
    public int b;
    public String c = "";
    public czgu d;
    public czgs e;

    static {
        czha czhaVar = new czha();
        f = czhaVar;
        dsqw.cc(czha.class, czhaVar);
    }

    private czha() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", czgz.c(), "c", "d", "e"});
            }
            if (i2 == 3) {
                return new czha();
            }
            if (i2 == 4) {
                return new czgx();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<czha> dssrVar = g;
            if (dssrVar == null) {
                synchronized (czha.class) {
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
