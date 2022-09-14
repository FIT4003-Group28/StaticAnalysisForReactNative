package defpackage;
/* compiled from: PG */
/* renamed from: dtqa  reason: default package */
/* loaded from: classes6.dex */
public final class dtqa extends dsqw<dtqa, dtpu> implements dssk {
    public static final dtqa b;
    private static volatile dssr<dtqa> c;
    public dsrj<dtpz> a = dssu.b;

    static {
        dtqa dtqaVar = new dtqa();
        b = dtqaVar;
        dsqw.cc(dtqa.class, dtqaVar);
    }

    private dtqa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dtpz.class});
            }
            if (i2 == 3) {
                return new dtqa();
            }
            if (i2 == 4) {
                return new dtpu();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtqa> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dtqa.class) {
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
