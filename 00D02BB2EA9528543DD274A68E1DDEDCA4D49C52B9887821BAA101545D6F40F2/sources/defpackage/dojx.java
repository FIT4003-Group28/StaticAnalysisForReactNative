package defpackage;
/* compiled from: PG */
/* renamed from: dojx  reason: default package */
/* loaded from: classes6.dex */
public final class dojx extends dsqw<dojx, doju> implements dssk {
    public static final dojx e;
    private static volatile dssr<dojx> f;
    public int a;
    public long b;
    public int c = 2;
    public String d = "";

    static {
        dojx dojxVar = new dojx();
        e = dojxVar;
        dsqw.cc(dojx.class, dojxVar);
    }

    private dojx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", dojv.a, "d"});
            }
            if (i2 == 3) {
                return new dojx();
            }
            if (i2 == 4) {
                return new doju();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dojx> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dojx.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
