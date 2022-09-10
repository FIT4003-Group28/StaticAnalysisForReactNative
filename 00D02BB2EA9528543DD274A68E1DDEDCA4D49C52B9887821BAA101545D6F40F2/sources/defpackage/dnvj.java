package defpackage;
/* compiled from: PG */
/* renamed from: dnvj  reason: default package */
/* loaded from: classes6.dex */
public final class dnvj extends dsqw<dnvj, dnvc> implements dssk {
    public static final dnvj c;
    private static volatile dssr<dnvj> f;
    public dqpe a;
    private int d;
    private byte e = 2;
    public dsrj<dnvi> b = dssu.b;

    static {
        dnvj dnvjVar = new dnvj();
        c = dnvjVar;
        dsqw.cc(dnvj.class, dnvjVar);
    }

    private dnvj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л", new Object[]{"d", "a", "b", dnvi.class});
            }
            if (i2 == 3) {
                return new dnvj();
            }
            if (i2 == 4) {
                return new dnvc();
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
            dssr<dnvj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dnvj.class) {
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
