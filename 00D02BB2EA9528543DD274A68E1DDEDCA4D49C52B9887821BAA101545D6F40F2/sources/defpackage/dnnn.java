package defpackage;
/* compiled from: PG */
/* renamed from: dnnn  reason: default package */
/* loaded from: classes.dex */
public final class dnnn extends dsqw<dnnn, dnnh> implements dssk {
    public static final dnnn l;
    private static volatile dssr<dnnn> m;
    public int a;
    public dqxa d;
    public int e;
    public int f;
    public dnnt h;
    public drdi i;
    public dqxc j;
    public dnnk k;
    public String b = "";
    public int c = 1;
    public String g = "";

    static {
        dnnn dnnnVar = new dnnn();
        l = dnnnVar;
        dsqw.cc(dnnn.class, dnnnVar);
    }

    private dnnn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\u0012\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဌ\u0003\u0004ဌ\u0004\u0006ဈ\u0005\tဉ\b\rဉ\u000b\u000fဉ\f\u0011ဉ\u0002\u0012ဉ\u000f", new Object[]{"a", "b", "c", "e", dnni.a, "f", dnnl.a, "g", "h", "i", "j", "d", "k"});
            }
            if (i2 == 3) {
                return new dnnn();
            }
            if (i2 == 4) {
                return new dnnh();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnnn> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dnnn.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
