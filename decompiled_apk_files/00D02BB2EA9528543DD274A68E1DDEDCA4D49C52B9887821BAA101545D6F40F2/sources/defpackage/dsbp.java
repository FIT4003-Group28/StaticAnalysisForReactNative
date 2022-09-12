package defpackage;
/* compiled from: PG */
/* renamed from: dsbp  reason: default package */
/* loaded from: classes6.dex */
public final class dsbp extends dsqw<dsbp, dsbl> implements dssk {
    public static final dsbp b;
    private static volatile dssr<dsbp> c;
    public dsrj<dsbo> a = dssu.b;

    static {
        dsbp dsbpVar = new dsbp();
        b = dsbpVar;
        dsqw.cc(dsbp.class, dsbpVar);
    }

    private dsbp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dsbo.class});
            }
            if (i2 == 3) {
                return new dsbp();
            }
            if (i2 == 4) {
                return new dsbl();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsbp> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dsbp.class) {
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
