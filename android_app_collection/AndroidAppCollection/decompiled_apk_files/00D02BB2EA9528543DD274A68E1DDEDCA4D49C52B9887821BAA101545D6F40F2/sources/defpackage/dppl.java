package defpackage;
/* compiled from: PG */
/* renamed from: dppl  reason: default package */
/* loaded from: classes6.dex */
public final class dppl extends dsqw<dppl, dpoy> implements dssk {
    public static final dppl m;
    private static volatile dssr<dppl> n;
    public int a;
    public Object c;
    public dppt d;
    public dppk g;
    public dpox h;
    public dqjt j;
    public dppa k;
    public dpre l;
    public int b = 0;
    public String e = "";
    public String f = "";
    public int i = -1;

    static {
        dppl dpplVar = new dppl();
        m = dpplVar;
        dsqw.cc(dppl.class, dpplVar);
    }

    private dppl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(m, "\u0001\f\u0001\u0001\u0002\u0011\f\u0000\u0000\u0000\u0002ြ\u0000\u0003ဈ\u0004\u0004ဈ\u0005\bဉ\u000b\tဉ\u0000\nဉ\t\fြ\u0000\rဉ\f\u000eဉ\u0007\u000fင\b\u0010ဉ\u0006\u0011ြ\u0000", new Object[]{"c", "b", "a", dppv.class, "e", "f", "k", "d", "j", dppi.class, "l", "h", "i", "g", dppe.class});
            }
            if (i2 == 3) {
                return new dppl();
            }
            if (i2 == 4) {
                return new dpoy();
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dppl> dssrVar = n;
            if (dssrVar == null) {
                synchronized (dppl.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(m);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
