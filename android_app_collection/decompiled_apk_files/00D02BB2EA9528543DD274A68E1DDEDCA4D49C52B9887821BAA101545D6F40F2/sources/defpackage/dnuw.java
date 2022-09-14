package defpackage;
/* compiled from: PG */
/* renamed from: dnuw  reason: default package */
/* loaded from: classes.dex */
public final class dnuw extends dsqw<dnuw, dnut> implements dssk {
    public static final dnuw d;
    private static volatile dssr<dnuw> g;
    public dqpe a;
    public int c;
    private int e;
    private byte f = 2;
    public dsrj<dnuv> b = dssu.b;

    static {
        dnuw dnuwVar = new dnuw();
        d = dnuwVar;
        dsqw.cc(dnuw.class, dnuwVar);
    }

    private dnuw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဉ\u0002\u0002Л\u0003ဌ\u0004", new Object[]{"e", "a", "b", dnuv.class, "c", drbs.a});
            }
            if (i2 == 3) {
                return new dnuw();
            }
            if (i2 == 4) {
                return new dnut();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dnuw> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dnuw.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
