package defpackage;
/* compiled from: PG */
/* renamed from: dijt  reason: default package */
/* loaded from: classes6.dex */
public final class dijt extends dsqw<dijt, dijs> implements dssk {
    public static final dijt c;
    private static volatile dssr<dijt> d;
    public int a;
    public String b = "";

    static {
        dijt dijtVar = new dijt();
        c = dijtVar;
        dsqw.cc(dijt.class, dijtVar);
    }

    private dijt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dijt();
            }
            if (i2 == 4) {
                return new dijs();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dijt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dijt.class) {
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
