package defpackage;
/* compiled from: PG */
/* renamed from: dkyp  reason: default package */
/* loaded from: classes6.dex */
public final class dkyp extends dsqw<dkyp, dkyo> implements dssk {
    public static final dkyp b;
    private static volatile dssr<dkyp> c;
    public dsrj<drlh> a = dssu.b;

    static {
        dkyp dkypVar = new dkyp();
        b = dkypVar;
        dsqw.cc(dkyp.class, dkypVar);
    }

    private dkyp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", drlh.class});
            }
            if (i2 == 3) {
                return new dkyp();
            }
            if (i2 == 4) {
                return new dkyo();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkyp> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dkyp.class) {
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
