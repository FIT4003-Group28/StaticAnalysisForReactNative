package defpackage;
/* compiled from: PG */
/* renamed from: ddnq  reason: default package */
/* loaded from: classes6.dex */
public final class ddnq extends dsqw<ddnq, ddnp> implements dssk {
    public static final ddnq j;
    private static volatile dssr<ddnq> k;
    public int a;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public String h = "";
    public boolean i;

    static {
        ddnq ddnqVar = new ddnq();
        j = ddnqVar;
        dsqw.cc(ddnq.class, ddnqVar);
    }

    private ddnq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဈ\u0007\tဇ\b", new Object[]{"a", "b", ddlq.a, "c", "d", "e", "f", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new ddnq();
            }
            if (i2 == 4) {
                return new ddnp();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddnq> dssrVar = k;
            if (dssrVar == null) {
                synchronized (ddnq.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
