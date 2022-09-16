package defpackage;
/* compiled from: PG */
/* renamed from: dlrb  reason: default package */
/* loaded from: classes6.dex */
public final class dlrb extends dsqw<dlrb, dlqy> implements dssk {
    public static final dlrb b;
    private static volatile dssr<dlrb> c;
    public dsrj<dlra> a = dssu.b;

    static {
        dlrb dlrbVar = new dlrb();
        b = dlrbVar;
        dsqw.cc(dlrb.class, dlrbVar);
    }

    private dlrb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", dlra.class});
            }
            if (i2 == 3) {
                return new dlrb();
            }
            if (i2 == 4) {
                return new dlqy();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlrb> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dlrb.class) {
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
