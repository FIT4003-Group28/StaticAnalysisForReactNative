package defpackage;
/* compiled from: PG */
/* renamed from: dveb  reason: default package */
/* loaded from: classes.dex */
public final class dveb extends dsqw<dveb, dvea> implements dssk {
    public static final dveb d;
    private static volatile dssr<dveb> f;
    public boolean a;
    public boolean b;
    public boolean c;
    private int e;

    static {
        dveb dvebVar = new dveb();
        d = dvebVar;
        dsqw.cc(dveb.class, dvebVar);
    }

    private dveb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dveb();
            }
            if (i2 == 4) {
                return new dvea();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dveb> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dveb.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
