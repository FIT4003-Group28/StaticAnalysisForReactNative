package defpackage;
/* compiled from: PG */
/* renamed from: pef  reason: default package */
/* loaded from: classes7.dex */
public final class pef extends dsqw<pef, pee> implements dssk {
    public static final pef e;
    private static volatile dssr<pef> f;
    public int a;
    public dlfv b;
    public pas c;
    public pau d;

    static {
        pef pefVar = new pef();
        e = pefVar;
        dsqw.cc(pef.class, pefVar);
    }

    private pef() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new pef();
            }
            if (i2 == 4) {
                return new pee();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<pef> dssrVar = f;
            if (dssrVar == null) {
                synchronized (pef.class) {
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
