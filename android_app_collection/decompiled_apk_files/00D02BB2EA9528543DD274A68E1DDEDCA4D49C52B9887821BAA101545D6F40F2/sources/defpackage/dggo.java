package defpackage;
/* compiled from: PG */
/* renamed from: dggo  reason: default package */
/* loaded from: classes6.dex */
public final class dggo extends dsqw<dggo, dggn> implements dssk {
    public static final dggo c;
    private static volatile dssr<dggo> e;
    public dggq a;
    public dggu b;
    private int d;

    static {
        dggo dggoVar = new dggo();
        c = dggoVar;
        dsqw.cc(dggo.class, dggoVar);
    }

    private dggo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dggo();
            }
            if (i2 == 4) {
                return new dggn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dggo> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dggo.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
