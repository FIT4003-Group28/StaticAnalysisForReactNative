package defpackage;
/* compiled from: PG */
/* renamed from: dhsm  reason: default package */
/* loaded from: classes6.dex */
public final class dhsm extends dsqw<dhsm, dhsl> implements dssk {
    public static final dhsm c;
    private static volatile dssr<dhsm> d;
    public int a;
    public dwpe b;

    static {
        dhsm dhsmVar = new dhsm();
        c = dhsmVar;
        dsqw.cc(dhsm.class, dhsmVar);
    }

    private dhsm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dhsm();
            }
            if (i2 == 4) {
                return new dhsl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhsm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhsm.class) {
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
