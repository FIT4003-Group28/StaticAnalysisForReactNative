package defpackage;
/* compiled from: PG */
/* renamed from: dlwa  reason: default package */
/* loaded from: classes.dex */
public final class dlwa extends dsqw<dlwa, dlvx> implements dssk {
    public static final dlwa c;
    private static volatile dssr<dlwa> d;
    public int a;
    public int b;

    static {
        dlwa dlwaVar = new dlwa();
        c = dlwaVar;
        dsqw.cc(dlwa.class, dlwaVar);
    }

    private dlwa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dlvy.a});
            }
            if (i2 == 3) {
                return new dlwa();
            }
            if (i2 == 4) {
                return new dlvx();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlwa> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlwa.class) {
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
