package defpackage;
/* compiled from: PG */
/* renamed from: dtsx  reason: default package */
/* loaded from: classes6.dex */
public final class dtsx extends dsqw<dtsx, dtsw> implements dssk {
    public static final dtsx e;
    private static volatile dssr<dtsx> f;
    public dstv a;
    public dspt b;
    public dtwr c;
    public dtsv d;

    static {
        dtsx dtsxVar = new dtsx();
        e = dtsxVar;
        dsqw.cc(dtsx.class, dtsxVar);
    }

    private dtsx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\u0007\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0004\t\u0007\t", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dtsx();
            }
            if (i2 == 4) {
                return new dtsw();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtsx> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtsx.class) {
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
