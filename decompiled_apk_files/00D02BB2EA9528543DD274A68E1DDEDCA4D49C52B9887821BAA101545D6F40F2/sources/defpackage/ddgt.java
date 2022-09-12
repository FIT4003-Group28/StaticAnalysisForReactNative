package defpackage;
/* compiled from: PG */
/* renamed from: ddgt  reason: default package */
/* loaded from: classes5.dex */
public final class ddgt extends dsqw<ddgt, ddgs> implements dssk {
    public static final ddgt c;
    private static volatile dssr<ddgt> d;
    public int a;
    public String b = "";

    static {
        ddgt ddgtVar = new ddgt();
        c = ddgtVar;
        dsqw.cc(ddgt.class, ddgtVar);
    }

    private ddgt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ddgt();
            }
            if (i2 == 4) {
                return new ddgs();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddgt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddgt.class) {
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
