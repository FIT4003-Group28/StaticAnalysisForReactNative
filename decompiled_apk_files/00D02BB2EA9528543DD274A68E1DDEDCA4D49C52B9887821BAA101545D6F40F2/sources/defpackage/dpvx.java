package defpackage;
/* compiled from: PG */
/* renamed from: dpvx  reason: default package */
/* loaded from: classes6.dex */
public final class dpvx extends dsqw<dpvx, dpvu> implements dssk {
    public static final dpvx d;
    private static volatile dssr<dpvx> e;
    public int a;
    public dpvw b;
    public dpvw c;

    static {
        dpvx dpvxVar = new dpvx();
        d = dpvxVar;
        dsqw.cc(dpvx.class, dpvxVar);
    }

    private dpvx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dpvx();
            }
            if (i2 == 4) {
                return new dpvu();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpvx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpvx.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}