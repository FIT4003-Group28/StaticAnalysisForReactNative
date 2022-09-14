package defpackage;
/* compiled from: PG */
/* renamed from: dlah  reason: default package */
/* loaded from: classes6.dex */
public final class dlah extends dsqw<dlah, dlag> implements dssk {
    public static final dlah b;
    private static volatile dssr<dlah> d;
    public String a = "";
    private int c;

    static {
        dlah dlahVar = new dlah();
        b = dlahVar;
        dsqw.cc(dlah.class, dlahVar);
    }

    private dlah() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dlah();
            }
            if (i2 == 4) {
                return new dlag();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlah> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlah.class) {
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
