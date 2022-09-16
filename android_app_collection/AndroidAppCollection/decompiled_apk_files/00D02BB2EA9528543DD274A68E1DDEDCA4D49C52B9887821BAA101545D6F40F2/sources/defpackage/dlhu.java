package defpackage;
/* compiled from: PG */
/* renamed from: dlhu  reason: default package */
/* loaded from: classes6.dex */
public final class dlhu extends dsqw<dlhu, dlhr> implements dssk {
    public static final dlhu c;
    private static volatile dssr<dlhu> d;
    public int a;
    public dlht b;

    static {
        dlhu dlhuVar = new dlhu();
        c = dlhuVar;
        dsqw.cc(dlhu.class, dlhuVar);
    }

    private dlhu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dlhu();
            }
            if (i2 == 4) {
                return new dlhr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlhu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlhu.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
