package defpackage;
/* compiled from: PG */
/* renamed from: dlkv  reason: default package */
/* loaded from: classes6.dex */
public final class dlkv extends dsqw<dlkv, dljx> implements dssk {
    public static final dlkv s;
    private static volatile dssr<dlkv> v;
    public int a;
    public dlkc b;
    public dlks d;
    public dqdk e;
    public dlgf g;
    public dlgf h;
    public long j;
    public long k;
    public long l;
    public int m;
    public int o;
    public String p;
    public long q;
    public dssd<Long, dljv> n = dssd.b;
    public dssd<Integer, Long> r = dssd.b;
    public String c = "";
    public dsrj<dlhl> f = dssu.b;
    public dsrj<dlet> i = dssu.b;
    private String t = "";
    private String u = "";

    static {
        dlkv dlkvVar = new dlkv();
        s = dlkvVar;
        dsqw.cc(dlkv.class, dlkvVar);
    }

    private dlkv() {
        dsqz dsqzVar = dsqz.b;
        this.p = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(s, "\u0001\u0013\u0000\u0001\u0001\u001c\u0013\u0002\u0002\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဉ\u0003\u0004ဉ\u0002\u0005\u001b\u0006\u001b\u0007ဂ\u0006\bဂ\u0007\tဌ\t\n2\u000bဌ\n\rဈ\f\u000eဈ\r\u000fဉ\u0004\u0010ဉ\u0005\u0013ဂ\b\u0015ဈ\u0010\u001aဂ\u0011\u001c2", new Object[]{"a", "b", "c", "e", "d", "f", dlhl.class, "i", dlet.class, "j", "k", "m", dlhm.a, "n", dljw.a, "o", dlju.c(), "t", "u", "g", "h", "l", "p", "q", "r", dljy.a});
            }
            if (i2 == 3) {
                return new dlkv();
            }
            if (i2 == 4) {
                return new dljx();
            }
            if (i2 == 5) {
                return s;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlkv> dssrVar = v;
            if (dssrVar == null) {
                synchronized (dlkv.class) {
                    dssrVar = v;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(s);
                        v = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
