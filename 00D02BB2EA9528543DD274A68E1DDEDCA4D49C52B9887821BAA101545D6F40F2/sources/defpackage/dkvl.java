package defpackage;
/* compiled from: PG */
/* renamed from: dkvl  reason: default package */
/* loaded from: classes.dex */
public final class dkvl extends dsqw<dkvl, dkvk> implements dssk {
    public static final dkvl b;
    private static volatile dssr<dkvl> d;
    public boolean a;
    private int c;

    static {
        dkvl dkvlVar = new dkvl();
        b = dkvlVar;
        dsqw.cc(dkvl.class, dkvlVar);
    }

    private dkvl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dkvl();
            }
            if (i2 == 4) {
                return new dkvk();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkvl> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkvl.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
