package defpackage;
/* compiled from: PG */
/* renamed from: dnrl  reason: default package */
/* loaded from: classes6.dex */
public final class dnrl extends dsqw<dnrl, dnrk> implements dssk {
    public static final dnrl e;
    private static volatile dssr<dnrl> f;
    public int a;
    public dnsc b;
    public dsrj<dniu> c = dssu.b;
    public dnrd d;

    static {
        dnrl dnrlVar = new dnrl();
        e = dnrlVar;
        dsqw.cc(dnrl.class, dnrlVar);
    }

    private dnrl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0004ဉ\u0001", new Object[]{"a", "b", "c", dniu.class, "d"});
            }
            if (i2 == 3) {
                return new dnrl();
            }
            if (i2 == 4) {
                return new dnrk();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnrl> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dnrl.class) {
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
