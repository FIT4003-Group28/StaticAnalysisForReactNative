package defpackage;
/* compiled from: PG */
/* renamed from: dlzp  reason: default package */
/* loaded from: classes6.dex */
public final class dlzp extends dsqw<dlzp, dlzo> implements dssk {
    public static final dlzp b;
    private static volatile dssr<dlzp> c;
    public dsrj<dlzr> a = dssu.b;

    static {
        dlzp dlzpVar = new dlzp();
        b = dlzpVar;
        dsqw.cc(dlzp.class, dlzpVar);
    }

    private dlzp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dlzr.class});
            }
            if (i2 == 3) {
                return new dlzp();
            }
            if (i2 == 4) {
                return new dlzo();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlzp> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dlzp.class) {
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
