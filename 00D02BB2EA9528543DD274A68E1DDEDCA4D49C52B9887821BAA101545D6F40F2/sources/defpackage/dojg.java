package defpackage;
/* compiled from: PG */
/* renamed from: dojg  reason: default package */
/* loaded from: classes6.dex */
public final class dojg extends dsqw<dojg, dojf> implements dssk {
    public static final dojg c;
    private static volatile dssr<dojg> d;
    public int a;
    public dntq b;

    static {
        dojg dojgVar = new dojg();
        c = dojgVar;
        dsqw.cc(dojg.class, dojgVar);
    }

    private dojg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dojg();
            }
            if (i2 == 4) {
                return new dojf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dojg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dojg.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
