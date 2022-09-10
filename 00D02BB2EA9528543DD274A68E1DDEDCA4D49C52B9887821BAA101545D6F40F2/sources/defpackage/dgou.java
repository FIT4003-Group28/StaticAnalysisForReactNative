package defpackage;
/* compiled from: PG */
/* renamed from: dgou  reason: default package */
/* loaded from: classes6.dex */
public final class dgou extends dsqw<dgou, dgot> implements dssk {
    public static final dgou d;
    private static volatile dssr<dgou> e;
    public int a;
    public dnqe b;
    public dhjz c;

    static {
        dgou dgouVar = new dgou();
        d = dgouVar;
        dsqw.cc(dgou.class, dgouVar);
    }

    private dgou() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dgou();
            }
            if (i2 == 4) {
                return new dgot();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgou> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgou.class) {
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
