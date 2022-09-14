package defpackage;
/* compiled from: PG */
/* renamed from: ditt  reason: default package */
/* loaded from: classes.dex */
public final class ditt extends dsqw<ditt, ditq> implements dssk {
    public static final ditt n;
    private static volatile dssr<ditt> o;
    public int a;
    public int d;
    public dits e;
    public dpop h;
    public dpuq k;
    public dpum l;
    public long m;
    public String b = "";
    public String c = "";
    public String f = "";
    public String g = "";
    public String i = "";
    public dspd j = dspd.b;

    static {
        ditt dittVar = new ditt();
        n = dittVar;
        dsqw.cc(ditt.class, dittVar);
    }

    private ditt() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(n, "\u0001\f\u0000\u0001\u0001\u0011\f\u0000\u0000\u0000\u0001ဈ\u0001\u0004ဉ\u0003\u0005ဈ\u0004\u0006ဉ\u0006\u0007ဈ\u0007\bည\b\tဉ\t\nစ\u000b\u000bဈ\u0000\u000fဌ\u0002\u0010ဈ\u0005\u0011ဉ\n", new Object[]{"a", "c", "e", "f", "h", "i", "j", "k", "m", "b", "d", dpwt.c(), "g", "l"});
            }
            if (i2 == 3) {
                return new ditt();
            }
            if (i2 == 4) {
                return new ditq();
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ditt> dssrVar = o;
            if (dssrVar == null) {
                synchronized (ditt.class) {
                    dssrVar = o;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(n);
                        o = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
