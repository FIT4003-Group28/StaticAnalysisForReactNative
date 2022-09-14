package defpackage;
/* compiled from: PG */
/* renamed from: dojp  reason: default package */
/* loaded from: classes6.dex */
public final class dojp extends dsqw<dojp, dojn> implements dssk {
    public static final dojp e;
    private static volatile dssr<dojp> f;
    public int a;
    public int b;
    public dolo c;
    public String d = "";

    static {
        dojp dojpVar = new dojp();
        e = dojpVar;
        dsqw.cc(dojp.class, dojpVar);
    }

    private dojp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဈ\u0002\u0004ဉ\u0001", new Object[]{"a", "b", dojo.a, "d", "c"});
            }
            if (i2 == 3) {
                return new dojp();
            }
            if (i2 == 4) {
                return new dojn();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dojp> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dojp.class) {
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
