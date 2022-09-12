package defpackage;
/* compiled from: PG */
/* renamed from: drdg  reason: default package */
/* loaded from: classes6.dex */
public final class drdg extends dsqw<drdg, drdb> implements dssk {
    public static final drdg q;
    private static volatile dssr<drdg> r;
    public int a;
    public dpum f;
    public float j;
    public drdf k;
    public int l;
    public dpxf n;
    public dgfy p;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String g = "";
    public String h = "";
    public dsrj<drcy> i = dssu.b;
    public dsrj<drdd> m = dssu.b;
    public String o = "";

    static {
        drdg drdgVar = new drdg();
        q = drdgVar;
        dsqw.cc(drdg.class, drdgVar);
    }

    private drdg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(q, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0004\u0005ဈ\u0005\u0006ဈ\u0006\u0007\u001b\bခ\u0007\tင\t\n\u001b\rဉ\r\u000eဈ\u0003\u000fဈ\u000f\u0010ဉ\b\u0011ဉ\u0010", new Object[]{"a", "b", "c", "d", "f", "g", "h", "i", drcy.class, "j", "l", "m", drdd.class, "n", "e", "o", "k", "p"});
            }
            if (i2 == 3) {
                return new drdg();
            }
            if (i2 == 4) {
                return new drdb();
            }
            if (i2 == 5) {
                return q;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drdg> dssrVar = r;
            if (dssrVar == null) {
                synchronized (drdg.class) {
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
