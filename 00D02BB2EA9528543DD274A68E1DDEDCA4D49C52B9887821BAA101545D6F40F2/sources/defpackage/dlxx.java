package defpackage;
/* compiled from: PG */
/* renamed from: dlxx  reason: default package */
/* loaded from: classes6.dex */
public final class dlxx extends dsqw<dlxx, dlxw> implements dssk {
    public static final dlxx a;
    private static volatile dssr<dlxx> b;

    static {
        dlxx dlxxVar = new dlxx();
        a = dlxxVar;
        dsqw.cc(dlxx.class, dlxxVar);
    }

    private dlxx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dlxx();
            }
            if (i2 == 4) {
                return new dlxw();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlxx> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dlxx.class) {
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
