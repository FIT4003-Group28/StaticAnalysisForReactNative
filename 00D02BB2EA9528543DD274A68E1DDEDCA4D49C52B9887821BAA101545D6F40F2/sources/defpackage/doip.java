package defpackage;
/* compiled from: PG */
/* renamed from: doip  reason: default package */
/* loaded from: classes6.dex */
public final class doip extends dsqw<doip, doio> implements dssk {
    public static final doip d;
    private static volatile dssr<doip> f;
    public int a;
    public dolo b;
    public boolean c;
    private int e;

    static {
        doip doipVar = new doip();
        d = doipVar;
        dsqw.cc(doip.class, doipVar);
    }

    private doip() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"e", "a", doim.a, "b", "c"});
            }
            if (i2 == 3) {
                return new doip();
            }
            if (i2 == 4) {
                return new doio();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doip> dssrVar = f;
            if (dssrVar == null) {
                synchronized (doip.class) {
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
