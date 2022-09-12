package defpackage;
/* compiled from: PG */
/* renamed from: dhdn  reason: default package */
/* loaded from: classes6.dex */
public final class dhdn extends dsqw<dhdn, dhdm> implements dssk {
    public static final dhdn b;
    private static volatile dssr<dhdn> c;
    public boolean a;

    static {
        dhdn dhdnVar = new dhdn();
        b = dhdnVar;
        dsqw.cc(dhdn.class, dhdnVar);
    }

    private dhdn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u0007", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dhdn();
            }
            if (i2 == 4) {
                return new dhdm();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhdn> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dhdn.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
