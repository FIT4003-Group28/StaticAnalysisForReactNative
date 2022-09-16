package defpackage;
/* compiled from: PG */
/* renamed from: dnpw  reason: default package */
/* loaded from: classes6.dex */
public final class dnpw extends dsqw<dnpw, dnpt> implements dssk {
    public static final dnpw d;
    private static volatile dssr<dnpw> e;
    public int a;
    public int b;
    public String c = "";

    static {
        dnpw dnpwVar = new dnpw();
        d = dnpwVar;
        dsqw.cc(dnpw.class, dnpwVar);
    }

    private dnpw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", dnpv.c(), "c"});
            }
            if (i2 == 3) {
                return new dnpw();
            }
            if (i2 == 4) {
                return new dnpt();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnpw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnpw.class) {
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
