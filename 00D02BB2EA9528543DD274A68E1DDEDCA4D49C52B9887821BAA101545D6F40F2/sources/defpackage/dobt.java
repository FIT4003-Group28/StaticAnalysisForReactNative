package defpackage;
/* compiled from: PG */
/* renamed from: dobt  reason: default package */
/* loaded from: classes6.dex */
public final class dobt extends dsqw<dobt, dobs> implements dssk {
    public static final dobt c;
    private static volatile dssr<dobt> d;
    public int a;
    public boolean b;

    static {
        dobt dobtVar = new dobt();
        c = dobtVar;
        dsqw.cc(dobt.class, dobtVar);
    }

    private dobt() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dobt();
            }
            if (i2 == 4) {
                return new dobs();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dobt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dobt.class) {
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
