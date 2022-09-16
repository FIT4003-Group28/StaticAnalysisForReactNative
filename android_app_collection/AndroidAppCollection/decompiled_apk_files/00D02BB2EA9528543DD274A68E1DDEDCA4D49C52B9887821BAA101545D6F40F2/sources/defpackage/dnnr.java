package defpackage;
/* compiled from: PG */
/* renamed from: dnnr  reason: default package */
/* loaded from: classes.dex */
public final class dnnr extends dsqw<dnnr, dnno> implements dssk {
    public static final dnnr n;
    private static volatile dssr<dnnr> o;
    public int a;
    public dnpq e;
    public boolean g;
    public boolean h;
    public dnhi j;
    public dqxc k;
    public dqxo m;
    public String b = "";
    public String c = "";
    public String d = "";
    public String f = "";
    public dsrj<dnnq> i = dssu.b;
    public dsrj<dqxq> l = dssu.b;

    static {
        dnnr dnnrVar = new dnnr();
        n = dnnrVar;
        dsqw.cc(dnnr.class, dnnrVar);
    }

    private dnnr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(n, "\u0001\f\u0000\u0001\u0001\u0014\f\u0000\u0002\u0000\u0001ဈ\u0001\u0002ဈ\u0002\u0003ဈ\u0003\u0006ဉ\b\tဈ\t\nဇ\n\u000bဇ\u000b\f\u001b\u000eဉ\r\u0012ဉ\u000f\u0013\u001b\u0014ဉ\u0010", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", dnnq.class, "j", "k", "l", dqxq.class, "m"});
            }
            if (i2 == 3) {
                return new dnnr();
            }
            if (i2 == 4) {
                return new dnno();
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnnr> dssrVar = o;
            if (dssrVar == null) {
                synchronized (dnnr.class) {
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
