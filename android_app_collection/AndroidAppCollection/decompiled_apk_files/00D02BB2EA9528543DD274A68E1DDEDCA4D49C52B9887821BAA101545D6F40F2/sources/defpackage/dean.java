package defpackage;
/* compiled from: PG */
/* renamed from: dean  reason: default package */
/* loaded from: classes.dex */
public final class dean extends dsqw<dean, deam> implements dssk {
    public static final dsrg<Integer, dpkj> c = new deal();
    public static final dean p;
    private static volatile dssr<dean> q;
    public int a;
    public deai e;
    public int f;
    public int g;
    public int h;
    public int j;
    public dneb k;
    public int l;
    public dpyc m;
    public int n;
    public dsrf b = dsqz.b;
    public dsrf d = dsqz.b;
    public dsrf i = dsqz.b;
    public dsrj<deak> o = dssu.b;

    static {
        dean deanVar = new dean();
        p = deanVar;
        dsqw.cc(dean.class, deanVar);
    }

    private dean() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(p, "\u0001\r\u0000\u0001\u0001\u000f\r\u0000\u0004\u0000\u0001\u001e\u0002\u001e\u0003ဉ\u0000\u0004ဌ\u0001\u0005ဌ\u0002\u0006ဌ\u0003\t\u001e\nင\u0005\u000bဉ\u0006\fင\u0007\rဉ\b\u000eင\t\u000f\u001b", new Object[]{"a", "b", dpkj.c(), "d", dpkr.c(), "e", "f", dpku.a, "g", dpkw.c(), "h", dpkl.c(), "i", dpkt.c(), "j", "k", "l", "m", "n", "o", deak.class});
            }
            if (i2 == 3) {
                return new dean();
            }
            if (i2 == 4) {
                return new deam();
            }
            if (i2 == 5) {
                return p;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dean> dssrVar = q;
            if (dssrVar == null) {
                synchronized (dean.class) {
                    dssrVar = q;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(p);
                        q = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
