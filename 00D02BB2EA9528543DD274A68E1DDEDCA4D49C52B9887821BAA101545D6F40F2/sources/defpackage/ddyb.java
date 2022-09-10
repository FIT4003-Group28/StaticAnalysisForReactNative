package defpackage;
/* compiled from: PG */
/* renamed from: ddyb  reason: default package */
/* loaded from: classes.dex */
public final class ddyb extends dsqw<ddyb, ddya> implements dssk {
    public static final ddyb e;
    private static volatile dssr<ddyb> g;
    public int a;
    public long b;
    public int c;
    public int d;
    private byte f = 2;

    static {
        ddyb ddybVar = new ddyb();
        e = ddybVar;
        dsqw.cc(ddyb.class, ddybVar);
    }

    private ddyb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔂ\u0000\u0002ᔆ\u0001\u0003ᔆ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ddyb();
            }
            if (i2 == 4) {
                return new ddya();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<ddyb> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ddyb.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
