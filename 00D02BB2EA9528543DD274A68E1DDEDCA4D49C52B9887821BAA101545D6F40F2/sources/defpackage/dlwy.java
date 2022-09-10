package defpackage;
/* compiled from: PG */
/* renamed from: dlwy  reason: default package */
/* loaded from: classes6.dex */
public final class dlwy extends dsqw<dlwy, dlwx> implements dssk {
    public static final dlwy d;
    private static volatile dssr<dlwy> f;
    public dhkd a;
    public int b = 1;
    public dspd c = dspd.b;
    private int e;

    static {
        dlwy dlwyVar = new dlwy();
        d = dlwyVar;
        dsqw.cc(dlwy.class, dlwyVar);
    }

    private dlwy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ည\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dlwy();
            }
            if (i2 == 4) {
                return new dlwx();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlwy> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dlwy.class) {
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
