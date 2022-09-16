package defpackage;
/* compiled from: PG */
/* renamed from: cpzp  reason: default package */
/* loaded from: classes5.dex */
public final class cpzp extends dsqw<cpzp, cpzo> implements dssk {
    public static final cpzp a;
    private static volatile dssr<cpzp> b;

    static {
        cpzp cpzpVar = new cpzp();
        a = cpzpVar;
        dsqw.cc(cpzp.class, cpzpVar);
    }

    private cpzp() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new cpzp();
            }
            if (i2 == 4) {
                return new cpzo();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cpzp> dssrVar = b;
            if (dssrVar == null) {
                synchronized (cpzp.class) {
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
