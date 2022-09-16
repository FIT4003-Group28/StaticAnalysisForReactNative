package defpackage;
/* compiled from: PG */
/* renamed from: dnva  reason: default package */
/* loaded from: classes.dex */
public final class dnva extends dsqw<dnva, dnuz> implements dssk {
    public static final dnva c;
    private static volatile dssr<dnva> f;
    public dqpe a;
    public int b;
    private int d;
    private byte e = 2;

    static {
        dnva dnvaVar = new dnva();
        c = dnvaVar;
        dsqw.cc(dnva.class, dnvaVar);
    }

    private dnva() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0001\u0003ဌ\u0002", new Object[]{"d", "a", "b", drbs.a});
            }
            if (i2 == 3) {
                return new dnva();
            }
            if (i2 == 4) {
                return new dnuz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dnva> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dnva.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
