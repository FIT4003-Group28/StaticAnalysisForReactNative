package defpackage;
/* compiled from: PG */
/* renamed from: dnjl  reason: default package */
/* loaded from: classes6.dex */
public final class dnjl extends dsqw<dnjl, dnjk> implements dssk {
    public static final dnjl b;
    private static volatile dssr<dnjl> d;
    public String a = "";
    private int c;

    static {
        dnjl dnjlVar = new dnjl();
        b = dnjlVar;
        dsqw.cc(dnjl.class, dnjlVar);
    }

    private dnjl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဈ\u0002", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dnjl();
            }
            if (i2 == 4) {
                return new dnjk();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnjl> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnjl.class) {
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
