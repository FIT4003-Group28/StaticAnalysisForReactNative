package defpackage;
/* compiled from: PG */
/* renamed from: durf  reason: default package */
/* loaded from: classes6.dex */
public final class durf extends dsqw<durf, dure> implements dssk {
    public static final durf c;
    private static volatile dssr<durf> d;
    public int a;
    public duqr b;

    static {
        durf durfVar = new durf();
        c = durfVar;
        dsqw.cc(durf.class, durfVar);
    }

    private durf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new durf();
            }
            if (i2 == 4) {
                return new dure();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<durf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (durf.class) {
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
