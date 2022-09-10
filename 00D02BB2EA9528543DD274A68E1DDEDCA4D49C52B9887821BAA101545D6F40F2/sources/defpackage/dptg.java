package defpackage;
/* compiled from: PG */
/* renamed from: dptg  reason: default package */
/* loaded from: classes.dex */
public final class dptg extends dsqw<dptg, dptf> implements dssk {
    public static final dptg q;
    private static volatile dssr<dptg> r;
    public int a;
    public dpum f;
    public dhjx g;
    public boolean i;
    public int j;
    public dgfs k;
    public boolean l;
    public boolean n;
    public boolean o;
    public boolean p;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public int h = -1;
    public String m = "";

    static {
        dptg dptgVar = new dptg();
        q = dptgVar;
        dsqw.cc(dptg.class, dptgVar);
    }

    private dptg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(q, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဌ\u0006\bဇ\u0007\nဇ\u000b\u000bဈ\f\fဇ\r\rဇ\u000e\u000eဇ\u000f\u000fဉ\n\u0010င\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", dplq.a, "i", "l", "m", "n", "o", "p", "k", "j"});
            }
            if (i2 == 3) {
                return new dptg();
            }
            if (i2 == 4) {
                return new dptf();
            }
            if (i2 == 5) {
                return q;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dptg> dssrVar = r;
            if (dssrVar == null) {
                synchronized (dptg.class) {
                    dssrVar = r;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(q);
                        r = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
