package defpackage;
/* compiled from: PG */
/* renamed from: dpfp  reason: default package */
/* loaded from: classes6.dex */
public final class dpfp extends dsqw<dpfp, dpfo> implements dssk {
    public static final dpfp b;
    private static volatile dssr<dpfp> c;
    public dsrj<dpfn> a = dssu.b;

    static {
        dpfp dpfpVar = new dpfp();
        b = dpfpVar;
        dsqw.cc(dpfp.class, dpfpVar);
    }

    private dpfp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dpfn.class});
            }
            if (i2 == 3) {
                return new dpfp();
            }
            if (i2 == 4) {
                return new dpfo();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpfp> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dpfp.class) {
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
