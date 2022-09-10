package defpackage;
/* compiled from: PG */
/* renamed from: dqsj  reason: default package */
/* loaded from: classes6.dex */
public final class dqsj extends dsqw<dqsj, dqsc> implements dssk {
    public static final dqsj p;
    private static volatile dssr<dqsj> r;
    public dqpe a;
    public int b;
    public long d;
    public long f;
    public long h;
    public dsrj<dqsg> i;
    public String j;
    public dsrj<dqse> k;
    public String l;
    public String m;
    public String n;
    public dqsi o;
    private int q;
    public String c = "";
    public String e = "";
    public String g = "";

    static {
        dqsj dqsjVar = new dqsj();
        p = dqsjVar;
        dsqw.cc(dqsj.class, dqsjVar);
    }

    private dqsj() {
        dssu<Object> dssuVar = dssu.b;
        this.i = dssu.b;
        this.j = "";
        this.k = dssu.b;
        this.l = "";
        this.m = "";
        this.n = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(p, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0004ဂ\u0004\u0005ဂ\u0006\u0006ဂ\b\bဈ\t\t\u001b\n\u001b\u000bဈ\u0003\fဈ\u0005\rဈ\u0007\u000eဈ\n\u000fဈ\u000b\u0010ဈ\f\u0011ဉ\r", new Object[]{"q", "a", "b", drbs.a, "d", "f", "h", "j", "k", dqse.class, "i", dqsg.class, "c", "e", "g", "l", "m", "n", "o"});
            }
            if (i2 == 3) {
                return new dqsj();
            }
            if (i2 == 4) {
                return new dqsc();
            }
            if (i2 == 5) {
                return p;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqsj> dssrVar = r;
            if (dssrVar == null) {
                synchronized (dqsj.class) {
                    dssrVar = r;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(p);
                        r = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
