package defpackage;
/* compiled from: PG */
/* renamed from: dnlf  reason: default package */
/* loaded from: classes6.dex */
public final class dnlf extends dsqw<dnlf, dnle> implements dssk {
    public static final dnlf a;
    private static volatile dssr<dnlf> b;

    static {
        dnlf dnlfVar = new dnlf();
        a = dnlfVar;
        dsqw.cc(dnlf.class, dnlfVar);
    }

    private dnlf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dnlf();
            }
            if (i2 == 4) {
                return new dnle();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnlf> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dnlf.class) {
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
