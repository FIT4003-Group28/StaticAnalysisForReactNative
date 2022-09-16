package defpackage;
/* compiled from: PG */
/* renamed from: dlkc  reason: default package */
/* loaded from: classes6.dex */
public final class dlkc extends dsqw<dlkc, dljz> implements dssk {
    public static final dlkc c;
    private static volatile dssr<dlkc> d;
    public int a = 0;
    public Object b;

    static {
        dlkc dlkcVar = new dlkc();
        c = dlkcVar;
        dsqw.cc(dlkc.class, dlkcVar);
    }

    private dlkc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဿ\u0000\u0002ျ\u0000", new Object[]{"b", "a", dlkb.c()});
            }
            if (i2 == 3) {
                return new dlkc();
            }
            if (i2 == 4) {
                return new dljz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlkc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlkc.class) {
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
