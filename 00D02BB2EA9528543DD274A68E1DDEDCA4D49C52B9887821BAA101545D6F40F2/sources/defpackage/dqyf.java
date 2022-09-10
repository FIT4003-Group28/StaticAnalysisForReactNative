package defpackage;
/* compiled from: PG */
/* renamed from: dqyf  reason: default package */
/* loaded from: classes6.dex */
public final class dqyf extends dsqw<dqyf, dqye> implements dssk {
    public static final dqyf a;
    private static volatile dssr<dqyf> b;

    static {
        dqyf dqyfVar = new dqyf();
        a = dqyfVar;
        dsqw.cc(dqyf.class, dqyfVar);
    }

    private dqyf() {
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
                return new dqyf();
            }
            if (i2 == 4) {
                return new dqye();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqyf> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dqyf.class) {
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
