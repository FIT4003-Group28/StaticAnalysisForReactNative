package defpackage;
/* compiled from: PG */
/* renamed from: duwv  reason: default package */
/* loaded from: classes.dex */
public final class duwv extends dsqw<duwv, duws> implements dssk {
    public static final duwv d;
    private static volatile dssr<duwv> f;
    public int a;
    public int b;
    public String c = "";
    private int e;

    static {
        duwv duwvVar = new duwv();
        d = duwvVar;
        dsqw.cc(duwv.class, duwvVar);
    }

    private duwv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"e", "a", duwt.a, "b", "c"});
            }
            if (i2 == 3) {
                return new duwv();
            }
            if (i2 == 4) {
                return new duws();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duwv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (duwv.class) {
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
