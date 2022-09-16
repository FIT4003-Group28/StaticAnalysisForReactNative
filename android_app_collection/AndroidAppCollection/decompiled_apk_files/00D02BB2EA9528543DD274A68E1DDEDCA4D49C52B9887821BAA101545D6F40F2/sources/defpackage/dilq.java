package defpackage;
/* compiled from: PG */
/* renamed from: dilq  reason: default package */
/* loaded from: classes6.dex */
public final class dilq extends dsqw<dilq, dilp> implements dssk {
    public static final dilq a;
    private static volatile dssr<dilq> b;

    static {
        dilq dilqVar = new dilq();
        a = dilqVar;
        dsqw.cc(dilq.class, dilqVar);
    }

    private dilq() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dilq();
            }
            if (i2 == 4) {
                return new dilp();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dilq> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dilq.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
