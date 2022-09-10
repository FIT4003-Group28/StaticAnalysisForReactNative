package defpackage;
/* compiled from: PG */
/* renamed from: dlyu  reason: default package */
/* loaded from: classes6.dex */
public final class dlyu extends dsqw<dlyu, dlyt> implements dssk {
    public static final dlyu a;
    private static volatile dssr<dlyu> b;

    static {
        dlyu dlyuVar = new dlyu();
        a = dlyuVar;
        dsqw.cc(dlyu.class, dlyuVar);
    }

    private dlyu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dlyu();
            }
            if (i2 == 4) {
                return new dlyt();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlyu> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dlyu.class) {
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
