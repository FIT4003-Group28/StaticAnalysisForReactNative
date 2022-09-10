package defpackage;
/* compiled from: PG */
/* renamed from: ddgo  reason: default package */
/* loaded from: classes.dex */
public final class ddgo extends dsqw<ddgo, ddgn> implements dssk {
    public static final ddgo c;
    private static volatile dssr<ddgo> d;
    public int a;
    public int b;

    static {
        ddgo ddgoVar = new ddgo();
        c = ddgoVar;
        dsqw.cc(ddgo.class, ddgoVar);
    }

    private ddgo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ddgo();
            }
            if (i2 == 4) {
                return new ddgn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddgo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddgo.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
