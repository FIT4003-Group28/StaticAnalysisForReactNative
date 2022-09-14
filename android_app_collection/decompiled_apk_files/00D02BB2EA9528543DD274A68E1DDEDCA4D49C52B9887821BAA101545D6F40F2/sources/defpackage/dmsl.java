package defpackage;
/* compiled from: PG */
/* renamed from: dmsl  reason: default package */
/* loaded from: classes.dex */
public final class dmsl extends dsqw<dmsl, dmsk> implements dssk {
    public static final dmsl l;
    private static volatile dssr<dmsl> m;
    public int a;
    public int b;
    public int c;
    public int d;
    public int f;
    public int h;
    public int i;
    public dmnt j;
    public dmnt k;
    public dsrf e = dsqz.b;
    public String g = "";

    static {
        dmsl dmslVar = new dmsl();
        l = dmslVar;
        dsqw.cc(dmsl.class, dmslVar);
    }

    private dmsl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0001\u0000\u0001ဆ\u0000\u0002င\u0002\u0003\u0016\u0004ဈ\u0005\bဏ\u0004\nဉ\t\u000bဉ\n\fင\u0007\u000eင\b\u000fဆ\u0001", new Object[]{"a", "b", "d", "e", "g", "f", "j", "k", "h", "i", "c"});
            }
            if (i2 == 3) {
                return new dmsl();
            }
            if (i2 == 4) {
                return new dmsk();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmsl> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dmsl.class) {
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
