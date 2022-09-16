package defpackage;
/* compiled from: PG */
/* renamed from: dnhm  reason: default package */
/* loaded from: classes6.dex */
public final class dnhm extends dsqs<dnhm, dnhj> implements dsqt {
    public static final dnhm e;
    private static volatile dssr<dnhm> g;
    public int a;
    public int b;
    public int c;
    private byte f = 2;
    public dsrj<dpjx> d = dssu.b;

    static {
        dnhm dnhmVar = new dnhm();
        e = dnhmVar;
        dsqw.cc(dnhm.class, dnhmVar);
    }

    private dnhm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0001\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0005\u001b", new Object[]{"a", "b", dnhl.a, "c", dnhk.a, "d", dpjx.class});
            }
            if (i2 == 3) {
                return new dnhm();
            }
            if (i2 == 4) {
                return new dnhj();
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
            dssr<dnhm> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dnhm.class) {
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
