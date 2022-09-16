package defpackage;
/* compiled from: PG */
/* renamed from: dwtf  reason: default package */
/* loaded from: classes.dex */
public final class dwtf extends dsqw<dwtf, dwtc> implements dssk {
    public static final dwtf d;
    private static volatile dssr<dwtf> e;
    public int a;
    public int b = 1;
    public int c;

    static {
        dwtf dwtfVar = new dwtf();
        d = dwtfVar;
        dsqw.cc(dwtf.class, dwtfVar);
    }

    private dwtf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", dwtd.a, "c"});
            }
            if (i2 == 3) {
                return new dwtf();
            }
            if (i2 == 4) {
                return new dwtc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwtf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwtf.class) {
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
