package defpackage;
/* compiled from: PG */
/* renamed from: dvwc  reason: default package */
/* loaded from: classes6.dex */
public final class dvwc extends dsqw<dvwc, dvwb> implements dssk {
    public static final dvwc e;
    private static volatile dssr<dvwc> f;
    public int a;
    public int b;
    public String c = "";
    public int d;

    static {
        dvwc dvwcVar = new dvwc();
        e = dvwcVar;
        dsqw.cc(dvwc.class, dvwcVar);
    }

    private dvwc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", dvwd.a});
            }
            if (i2 == 3) {
                return new dvwc();
            }
            if (i2 == 4) {
                return new dvwb();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvwc> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvwc.class) {
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
