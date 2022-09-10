package defpackage;
/* compiled from: PG */
/* renamed from: dfoo  reason: default package */
/* loaded from: classes6.dex */
public final class dfoo extends dsqw<dfoo, dfol> implements dssk {
    public static final dfoo e;
    private static volatile dssr<dfoo> f;
    public int a;
    public int b = 1;
    public long c;
    public long d;

    static {
        dfoo dfooVar = new dfoo();
        e = dfooVar;
        dsqw.cc(dfoo.class, dfooVar);
    }

    private dfoo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", dfom.a, "c", "d"});
            }
            if (i2 == 3) {
                return new dfoo();
            }
            if (i2 == 4) {
                return new dfol();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfoo> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dfoo.class) {
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
