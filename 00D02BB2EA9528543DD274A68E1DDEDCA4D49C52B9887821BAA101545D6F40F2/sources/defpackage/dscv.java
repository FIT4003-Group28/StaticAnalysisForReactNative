package defpackage;
/* compiled from: PG */
/* renamed from: dscv  reason: default package */
/* loaded from: classes6.dex */
public final class dscv extends dsqw<dscv, dscs> implements dssk {
    public static final dscv e;
    private static volatile dssr<dscv> f;
    public int a;
    public String b = "";
    public dscu c;
    public dscu d;

    static {
        dscv dscvVar = new dscv();
        e = dscvVar;
        dsqw.cc(dscv.class, dscvVar);
    }

    private dscv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dscv();
            }
            if (i2 == 4) {
                return new dscs();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dscv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dscv.class) {
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
