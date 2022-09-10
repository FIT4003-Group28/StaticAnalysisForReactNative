package defpackage;
/* compiled from: PG */
/* renamed from: dlor  reason: default package */
/* loaded from: classes6.dex */
public final class dlor extends dsqw<dlor, dloo> implements dssk {
    public static final dlor c;
    private static volatile dssr<dlor> d;
    public int a;
    public int b;

    static {
        dlor dlorVar = new dlor();
        c = dlorVar;
        dsqw.cc(dlor.class, dlorVar);
    }

    private dlor() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dlop.a});
            }
            if (i2 == 3) {
                return new dlor();
            }
            if (i2 == 4) {
                return new dloo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlor> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlor.class) {
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
