package defpackage;
/* compiled from: PG */
/* renamed from: ddsg  reason: default package */
/* loaded from: classes6.dex */
public final class ddsg extends dsqw<ddsg, ddsd> implements dssk {
    public static final ddsg q;
    private static volatile dssr<ddsg> r;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public String n = "";
    public dsrj<String> o = dssu.b;
    public dsrj<ddsb> p = dssu.b;

    static {
        ddsg ddsgVar = new ddsg();
        q = ddsgVar;
        dsqw.cc(ddsg.class, ddsgVar);
    }

    private ddsg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(q, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nဇ\t\u000bင\n\fင\u000b\rဌ\f\u000eဈ\r\u000f\u001b\u0010\u001a", new Object[]{"a", "b", ddsf.a, "c", ddse.a, "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", dgsn.c(), "n", "p", ddsb.class, "o"});
            }
            if (i2 == 3) {
                return new ddsg();
            }
            if (i2 == 4) {
                return new ddsd();
            }
            if (i2 == 5) {
                return q;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddsg> dssrVar = r;
            if (dssrVar == null) {
                synchronized (ddsg.class) {
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
