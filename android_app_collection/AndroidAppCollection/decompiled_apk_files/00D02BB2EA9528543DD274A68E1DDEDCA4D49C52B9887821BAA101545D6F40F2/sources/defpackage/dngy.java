package defpackage;
/* compiled from: PG */
/* renamed from: dngy  reason: default package */
/* loaded from: classes6.dex */
public final class dngy extends dsqw<dngy, dngx> implements dssk {
    public static final dngy d;
    private static volatile dssr<dngy> f;
    public int b;
    private int e;
    public String a = "";
    public String c = "";

    static {
        dngy dngyVar = new dngy();
        d = dngyVar;
        dsqw.cc(dngy.class, dngyVar);
    }

    private dngy() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u000b\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u000bဈ\u0002", new Object[]{"e", "a", "b", dngv.a, "c"});
            }
            if (i2 == 3) {
                return new dngy();
            }
            if (i2 == 4) {
                return new dngx();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dngy> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dngy.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
