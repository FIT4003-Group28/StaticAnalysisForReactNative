package defpackage;
/* compiled from: PG */
/* renamed from: ddnw  reason: default package */
/* loaded from: classes6.dex */
public final class ddnw extends dsqw<ddnw, ddnv> implements dssk {
    public static final ddnw m;
    private static volatile dssr<ddnw> n;
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public ddmi f;
    public ddmi g;
    public int h;
    public int i;
    public ddmi j;
    public int k;
    public int l;

    static {
        ddnw ddnwVar = new ddnw();
        m = ddnwVar;
        dsqw.cc(ddnw.class, ddnwVar);
    }

    private ddnw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007င\u0006\bင\u0007\tဉ\b\nင\t\u000bင\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            }
            if (i2 == 3) {
                return new ddnw();
            }
            if (i2 == 4) {
                return new ddnv();
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddnw> dssrVar = n;
            if (dssrVar == null) {
                synchronized (ddnw.class) {
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
