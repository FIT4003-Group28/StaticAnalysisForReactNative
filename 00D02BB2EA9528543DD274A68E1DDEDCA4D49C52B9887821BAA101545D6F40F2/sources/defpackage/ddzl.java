package defpackage;
/* compiled from: PG */
/* renamed from: ddzl  reason: default package */
/* loaded from: classes6.dex */
public final class ddzl extends dsqw<ddzl, ddzi> implements dssk {
    public static final ddzl c;
    private static volatile dssr<ddzl> d;
    public int a;
    public int b;

    static {
        ddzl ddzlVar = new ddzl();
        c = ddzlVar;
        dsqw.cc(ddzl.class, ddzlVar);
    }

    private ddzl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", ddzj.a});
            }
            if (i2 == 3) {
                return new ddzl();
            }
            if (i2 == 4) {
                return new ddzi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddzl> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddzl.class) {
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
