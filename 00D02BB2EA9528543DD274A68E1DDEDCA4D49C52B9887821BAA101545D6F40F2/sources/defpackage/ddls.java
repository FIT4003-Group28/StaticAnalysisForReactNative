package defpackage;
/* compiled from: PG */
/* renamed from: ddls  reason: default package */
/* loaded from: classes.dex */
public final class ddls extends dsqw<ddls, ddlr> implements dssk {
    public static final ddls k;
    private static volatile dssr<ddls> l;
    public int a;
    public int b;
    public ddll c;
    public ddoo d;
    public ddqs e;
    public ddmw f;
    public ddnh g;
    public ddrw h;
    public ddbq i;
    public ddqm j;

    static {
        ddls ddlsVar = new ddls();
        k = ddlsVar;
        dsqw.cc(ddls.class, ddlsVar);
    }

    private ddls() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0004\u0007ဉ\u0006\bဉ\u0007\tဉ\b\fဉ\u000b\rဉ\f", new Object[]{"a", "b", dukj.c(), "c", "d", "e", "f", "g", "h", "i", "j"});
            }
            if (i2 == 3) {
                return new ddls();
            }
            if (i2 == 4) {
                return new ddlr();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddls> dssrVar = l;
            if (dssrVar == null) {
                synchronized (ddls.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
