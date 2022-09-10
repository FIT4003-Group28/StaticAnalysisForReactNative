package defpackage;
/* compiled from: PG */
/* renamed from: ddlw  reason: default package */
/* loaded from: classes6.dex */
public final class ddlw extends dsqw<ddlw, ddlv> implements dssk {
    public static final ddlw c;
    private static volatile dssr<ddlw> d;
    public int a;
    public ddly b;

    static {
        ddlw ddlwVar = new ddlw();
        c = ddlwVar;
        dsqw.cc(ddlw.class, ddlwVar);
    }

    private ddlw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ddlw();
            }
            if (i2 == 4) {
                return new ddlv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddlw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddlw.class) {
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
