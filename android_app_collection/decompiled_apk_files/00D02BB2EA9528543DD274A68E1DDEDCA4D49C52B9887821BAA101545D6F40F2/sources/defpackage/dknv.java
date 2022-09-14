package defpackage;
/* compiled from: PG */
/* renamed from: dknv  reason: default package */
/* loaded from: classes.dex */
public final class dknv extends dsqw<dknv, dkns> implements dssk {
    public static final dknv v;
    private static volatile dssr<dknv> w;
    public int a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public dknu g;
    public boolean h;
    public int i;
    public boolean j;
    public boolean k;
    public dirl l;
    public dhlb m;
    public dhlb n;
    public boolean o;
    public boolean p;
    public dkgv q;
    public boolean r;
    public boolean s;
    public dkny u;
    public dsrj<String> d = dssu.b;
    public String t = "prod";

    static {
        dknv dknvVar = new dknv();
        v = dknvVar;
        dsqw.cc(dknv.class, dknvVar);
    }

    private dknv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(v, "\u0001\u0014\u0000\u0001\u0001\u001c\u0014\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007င\u0006\nဇ\t\fဇ\u000b\u000eဉ\r\u000fဉ\u000e\u0010\u001a\u0011ဇ\u0010\u0012ဇ\u0011\u0014ဉ\u000f\u0015ဇ\u0014\u0018ဇ\u0017\u001aဉ\u0012\u001bဉ\u001a\u001cဈ\u0018", new Object[]{"a", "b", "c", "e", "f", "g", "h", "i", "j", "k", "l", "m", "d", "o", "p", "n", "r", "s", "q", "u", "t"});
            }
            if (i2 == 3) {
                return new dknv();
            }
            if (i2 == 4) {
                return new dkns();
            }
            if (i2 == 5) {
                return v;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dknv> dssrVar = w;
            if (dssrVar == null) {
                synchronized (dknv.class) {
                    dssrVar = w;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(v);
                        w = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
