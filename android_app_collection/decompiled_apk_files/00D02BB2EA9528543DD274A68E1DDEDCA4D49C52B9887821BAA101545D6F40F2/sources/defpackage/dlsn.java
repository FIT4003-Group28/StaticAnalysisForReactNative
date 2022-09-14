package defpackage;
/* compiled from: PG */
/* renamed from: dlsn  reason: default package */
/* loaded from: classes6.dex */
public final class dlsn extends dsqw<dlsn, dlsm> implements dssk {
    public static final dlsn b;
    private static volatile dssr<dlsn> d;
    public long a;
    private int c;

    static {
        dlsn dlsnVar = new dlsn();
        b = dlsnVar;
        dsqw.cc(dlsn.class, dlsnVar);
    }

    private dlsn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dlsn();
            }
            if (i2 == 4) {
                return new dlsm();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlsn> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlsn.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
