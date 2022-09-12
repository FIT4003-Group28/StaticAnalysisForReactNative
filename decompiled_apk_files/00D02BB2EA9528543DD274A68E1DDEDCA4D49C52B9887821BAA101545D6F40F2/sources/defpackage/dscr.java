package defpackage;
/* compiled from: PG */
/* renamed from: dscr  reason: default package */
/* loaded from: classes6.dex */
public final class dscr extends dsqw<dscr, dsco> implements dssk {
    public static final dscr o;
    private static volatile dssr<dscr> q;
    public Object b;
    public long d;
    public dsed e;
    public long g;
    public long h;
    public dsok j;
    public long l;
    public int m;
    public dsfr n;
    private int p;
    public int a = 0;
    public String c = "";
    public dsrj<dscq> f = dssu.b;
    public String i = "";
    public String k = "";

    static {
        dscr dscrVar = new dscr();
        o = dscrVar;
        dsqw.cc(dscr.class, dscrVar);
    }

    private dscr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(o, "\u0001\u0010\u0001\u0001\u0005\u0018\u0010\u0000\u0001\u0000\u0005\u001b\bဂ\b\tဂ\t\nဈ\u0001\fြ\u0000\rြ\u0000\u000eဉ\u000f\u000fဉ\u0005\u0010ဈ\u0010\u0011ြ\u0000\u0012ြ\u0000\u0014ဂ\u0011\u0015ဌ\u0012\u0016ဈ\u000e\u0017ဂ\u0004\u0018ဉ\u0013", new Object[]{"b", "a", "p", "f", dscq.class, "g", "h", "c", dsch.class, dsdf.class, "j", "e", "k", dseh.class, dscz.class, "l", "m", dsdk.a, "i", "d", "n"});
            }
            if (i2 == 3) {
                return new dscr();
            }
            if (i2 == 4) {
                return new dsco();
            }
            if (i2 == 5) {
                return o;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dscr> dssrVar = q;
            if (dssrVar == null) {
                synchronized (dscr.class) {
                    dssrVar = q;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(o);
                        q = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
