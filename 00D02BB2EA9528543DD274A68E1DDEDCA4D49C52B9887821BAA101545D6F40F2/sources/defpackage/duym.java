package defpackage;
/* compiled from: PG */
/* renamed from: duym  reason: default package */
/* loaded from: classes.dex */
public final class duym extends dsqw<duym, duyf> implements dssk {
    public static final duym n;
    private static volatile dssr<duym> p;
    public duyl a;
    public boolean d;
    public duyj g;
    public boolean h;
    public boolean i;
    public boolean m;
    private int o;
    public boolean b = true;
    public String c = "";
    public String e = "";
    public dsrj<duyh> f = dssu.b;
    public String j = "";
    public int k = 10000;
    public int l = 200;

    static {
        duym duymVar = new duym();
        n = duymVar;
        dsqw.cc(duym.class, duymVar);
    }

    private duym() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(n, "\u0001\r\u0000\u0001\u0003!\r\u0000\u0001\u0000\u0003ဉ\u0000\nဇ\u0005\u000bဈ\u0006\rဇ\b\u000eဈ\t\u000f\u001b\u0013ဉ\r\u0015ဇ\u0010\u0016ဈ\u0013\u0017ဇ\u0011\u0019င\u0014\u001aင\u0015!ဇ\u0019", new Object[]{"o", "a", "b", "c", "d", "e", "f", duyh.class, "g", "h", "j", "i", "k", "l", "m"});
            }
            if (i2 == 3) {
                return new duym();
            }
            if (i2 == 4) {
                return new duyf();
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duym> dssrVar = p;
            if (dssrVar == null) {
                synchronized (duym.class) {
                    dssrVar = p;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(n);
                        p = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
