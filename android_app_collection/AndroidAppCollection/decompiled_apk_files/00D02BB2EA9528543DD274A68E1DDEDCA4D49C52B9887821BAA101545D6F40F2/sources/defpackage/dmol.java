package defpackage;
/* compiled from: PG */
/* renamed from: dmol  reason: default package */
/* loaded from: classes.dex */
public final class dmol extends dsqw<dmol, dmoi> implements dssk {
    public static final dmol n;
    private static volatile dssr<dmol> o;
    public int a;
    public long e;
    public long f;
    public int h;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public String b = "";
    public String c = "";
    public String d = "";
    public String g = "";
    public String i = "";

    static {
        dmol dmolVar = new dmol();
        n = dmolVar;
        dsqw.cc(dmol.class, dmolVar);
    }

    private dmol() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(n, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003စ\u0003\u0004စ\u0004\u0005ဈ\u0007\u0006ဇ\t\bဇ\u000b\tဈ\u0002\nဇ\f\u000bဈ\u0005\fဌ\u0006\u000eင\r", new Object[]{"a", "b", "c", "e", "f", "i", "j", "k", "d", "l", "g", "h", dmoj.a, "m"});
            }
            if (i2 == 3) {
                return new dmol();
            }
            if (i2 == 4) {
                return new dmoi();
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmol> dssrVar = o;
            if (dssrVar == null) {
                synchronized (dmol.class) {
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
