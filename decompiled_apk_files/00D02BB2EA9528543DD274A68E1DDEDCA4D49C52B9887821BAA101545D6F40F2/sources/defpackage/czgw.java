package defpackage;
/* compiled from: PG */
/* renamed from: czgw  reason: default package */
/* loaded from: classes5.dex */
public final class czgw extends dsqw<czgw, czgv> implements dssk {
    public static final czgw d;
    private static volatile dssr<czgw> e;
    public int a;
    public dsrj<czha> b = dssu.b;
    public String c = "";

    static {
        czgw czgwVar = new czgw();
        d = czgwVar;
        dsqw.cc(czgw.class, czgwVar);
    }

    private czgw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"a", "b", czha.class, "c"});
            }
            if (i2 == 3) {
                return new czgw();
            }
            if (i2 == 4) {
                return new czgv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<czgw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (czgw.class) {
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
