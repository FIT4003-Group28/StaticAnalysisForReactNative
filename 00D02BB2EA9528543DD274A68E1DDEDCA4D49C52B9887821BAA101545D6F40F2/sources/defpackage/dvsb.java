package defpackage;
/* compiled from: PG */
/* renamed from: dvsb  reason: default package */
/* loaded from: classes.dex */
public final class dvsb extends dsqw<dvsb, dvsa> implements dssk {
    public static final dvsb f;
    private static volatile dssr<dvsb> g;
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public int e;

    static {
        dvsb dvsbVar = new dvsb();
        f = dvsbVar;
        dsqw.cc(dvsb.class, dvsbVar);
    }

    private dvsb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0002\u0003င\u0003\u0007ဇ\u0001", new Object[]{"a", "b", "d", "e", "c"});
            }
            if (i2 == 3) {
                return new dvsb();
            }
            if (i2 == 4) {
                return new dvsa();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvsb> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dvsb.class) {
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
