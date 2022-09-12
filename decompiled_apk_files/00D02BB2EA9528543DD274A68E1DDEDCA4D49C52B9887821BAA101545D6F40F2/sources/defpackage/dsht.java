package defpackage;
/* compiled from: PG */
/* renamed from: dsht  reason: default package */
/* loaded from: classes6.dex */
public final class dsht extends dsqw<dsht, dsho> implements dssk {
    public static final dsht b;
    private static volatile dssr<dsht> c;
    public dsrj<dshs> a = dssu.b;

    static {
        dsht dshtVar = new dsht();
        b = dshtVar;
        dsqw.cc(dsht.class, dshtVar);
    }

    private dsht() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dshs.class});
            }
            if (i2 == 3) {
                return new dsht();
            }
            if (i2 == 4) {
                return new dsho();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsht> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dsht.class) {
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
