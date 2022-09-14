package defpackage;
/* compiled from: PG */
/* renamed from: dohy  reason: default package */
/* loaded from: classes6.dex */
public final class dohy extends dsqw<dohy, dohx> implements dssk {
    public static final dohy b;
    private static volatile dssr<dohy> c;
    public dsrj<dntq> a = dssu.b;

    static {
        dohy dohyVar = new dohy();
        b = dohyVar;
        dsqw.cc(dohy.class, dohyVar);
    }

    private dohy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dntq.class});
            }
            if (i2 == 3) {
                return new dohy();
            }
            if (i2 == 4) {
                return new dohx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dohy> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dohy.class) {
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
