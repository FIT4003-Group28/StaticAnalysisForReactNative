package defpackage;
/* compiled from: PG */
/* renamed from: dkql  reason: default package */
/* loaded from: classes.dex */
public final class dkql extends dsqw<dkql, dkqk> implements dssk {
    public static final dkql k;
    private static volatile dssr<dkql> m;
    public dkhd a;
    public boolean e;
    public boolean h;
    public boolean i;
    public boolean j;
    private int l;
    public int b = 14400;
    public int c = cpnx.a;
    public int d = 600;
    public int f = 5000;
    public int g = 600;

    static {
        dkql dkqlVar = new dkql();
        k = dkqlVar;
        dsqw.cc(dkql.class, dkqlVar);
    }

    private dkql() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\n\u0000\u0001\u0001\u000e\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002\bင\t\tင\n\nဇ\u000b\u000bင\u0003\fဇ\f\rဇ\r\u000eဇ\b", new Object[]{"l", "a", "b", "c", "f", "g", "h", "d", "i", "j", "e"});
            }
            if (i2 == 3) {
                return new dkql();
            }
            if (i2 == 4) {
                return new dkqk();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkql> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dkql.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
