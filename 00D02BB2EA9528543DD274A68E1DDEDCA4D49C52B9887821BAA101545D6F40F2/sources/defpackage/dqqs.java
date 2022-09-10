package defpackage;
/* compiled from: PG */
/* renamed from: dqqs  reason: default package */
/* loaded from: classes6.dex */
public final class dqqs extends dsqw<dqqs, dqqp> implements dssk {
    public static final dqqs b;
    private static volatile dssr<dqqs> c;
    public dsrj<dqqr> a = dssu.b;

    static {
        dqqs dqqsVar = new dqqs();
        b = dqqsVar;
        dsqw.cc(dqqs.class, dqqsVar);
    }

    private dqqs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dqqr.class});
            }
            if (i2 == 3) {
                return new dqqs();
            }
            if (i2 == 4) {
                return new dqqp();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqqs> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dqqs.class) {
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
