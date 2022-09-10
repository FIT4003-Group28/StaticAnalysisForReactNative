package defpackage;
/* compiled from: PG */
/* renamed from: dlvw  reason: default package */
/* loaded from: classes6.dex */
public final class dlvw extends dsqw<dlvw, dlvv> implements dssk {
    public static final dlvw b;
    private static volatile dssr<dlvw> d;
    public dlxg a;
    private int c;

    static {
        dlvw dlvwVar = new dlvw();
        b = dlvwVar;
        dsqw.cc(dlvw.class, dlvwVar);
    }

    private dlvw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dlvw();
            }
            if (i2 == 4) {
                return new dlvv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlvw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlvw.class) {
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
