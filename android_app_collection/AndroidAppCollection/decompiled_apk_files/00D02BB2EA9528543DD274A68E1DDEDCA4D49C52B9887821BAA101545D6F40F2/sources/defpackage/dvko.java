package defpackage;
/* compiled from: PG */
/* renamed from: dvko  reason: default package */
/* loaded from: classes.dex */
public final class dvko extends dsqw<dvko, dvkl> implements dssk {
    public static final dvko n;
    private static volatile dssr<dvko> o;
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    static {
        dvko dvkoVar = new dvko();
        n = dvkoVar;
        dsqw.cc(dvko.class, dvkoVar);
    }

    private dvko() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(n, "\u0001\f\u0000\u0001\u0002\u0012\f\u0000\u0000\u0000\u0002ဌ\u0001\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဇ\u000b\rဇ\f\u0011ဇ\u0010\u0012ဇ\u0011", new Object[]{"a", "b", dvkm.a, "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            }
            if (i2 == 3) {
                return new dvko();
            }
            if (i2 == 4) {
                return new dvkl();
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvko> dssrVar = o;
            if (dssrVar == null) {
                synchronized (dvko.class) {
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
