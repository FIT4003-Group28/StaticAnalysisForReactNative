package defpackage;
/* compiled from: PG */
/* renamed from: drmb  reason: default package */
/* loaded from: classes6.dex */
public final class drmb extends dsqw<drmb, drma> implements dssk {
    public static final drmb d;
    private static volatile dssr<drmb> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        drmb drmbVar = new drmb();
        d = drmbVar;
        dsqw.cc(drmb.class, drmbVar);
    }

    private drmb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new drmb();
            }
            if (i2 == 4) {
                return new drma();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drmb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drmb.class) {
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
