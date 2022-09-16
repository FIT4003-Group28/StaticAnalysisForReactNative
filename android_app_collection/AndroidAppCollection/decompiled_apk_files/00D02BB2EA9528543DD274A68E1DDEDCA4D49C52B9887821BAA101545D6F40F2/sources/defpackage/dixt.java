package defpackage;
/* compiled from: PG */
/* renamed from: dixt  reason: default package */
/* loaded from: classes6.dex */
public final class dixt extends dsqw<dixt, dixs> implements dssk {
    public static final dixt n;
    private static volatile dssr<dixt> o;
    public int a;
    public int b = 0;
    public Object c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public int h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int m;

    static {
        dixt dixtVar = new dixt();
        n = dixtVar;
        dsqw.cc(dixt.class, dixtVar);
    }

    private dixt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(n, "\u0001\f\u0001\u0001\u0001\r\f\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003စ\u0003\u0004င\u0004\u0005ဇ\u0005\u0006ဇ\u0006\u0007င\u0007\bင\b\nင\n\u000bဇ\u0002\f်\u0000\r်\u0000", new Object[]{"c", "b", "a", "d", "e", "g", "h", "i", "j", "k", "l", "m", "f"});
            }
            if (i2 == 3) {
                return new dixt();
            }
            if (i2 == 4) {
                return new dixs();
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dixt> dssrVar = o;
            if (dssrVar == null) {
                synchronized (dixt.class) {
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
