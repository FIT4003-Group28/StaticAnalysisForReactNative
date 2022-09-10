package defpackage;
/* compiled from: PG */
/* renamed from: eazl  reason: default package */
/* loaded from: classes6.dex */
public final class eazl extends dsqw<eazl, eazk> implements dssk {
    public static final eazl e;
    private static volatile dssr<eazl> f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        eazl eazlVar = new eazl();
        e = eazlVar;
        dsqw.cc(eazl.class, eazlVar);
    }

    private eazl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"a", "b", eazm.a, "c", eazf.a, "d"});
            }
            if (i2 == 3) {
                return new eazl();
            }
            if (i2 == 4) {
                return new eazk();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eazl> dssrVar = f;
            if (dssrVar == null) {
                synchronized (eazl.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
