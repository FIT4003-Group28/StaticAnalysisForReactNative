package defpackage;
/* compiled from: PG */
/* renamed from: dlqs  reason: default package */
/* loaded from: classes6.dex */
public final class dlqs extends dsqw<dlqs, dlqr> implements dssk {
    public static final dlqs b;
    private static volatile dssr<dlqs> c;
    public dsrj<dlsg> a = dssu.b;

    static {
        dlqs dlqsVar = new dlqs();
        b = dlqsVar;
        dsqw.cc(dlqs.class, dlqsVar);
    }

    private dlqs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dlsg.class});
            }
            if (i2 == 3) {
                return new dlqs();
            }
            if (i2 == 4) {
                return new dlqr();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlqs> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dlqs.class) {
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
