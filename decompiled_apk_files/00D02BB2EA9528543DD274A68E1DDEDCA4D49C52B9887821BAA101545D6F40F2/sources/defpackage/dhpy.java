package defpackage;
/* compiled from: PG */
/* renamed from: dhpy  reason: default package */
/* loaded from: classes.dex */
public final class dhpy extends dsqw<dhpy, dhpk> implements dssk {
    public static final dhpy j;
    private static volatile dssr<dhpy> l;
    public boolean a;
    public dhpx b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public dhpt h;
    public dhpm i;
    private int k;

    static {
        dhpy dhpyVar = new dhpy();
        j = dhpyVar;
        dsqw.cc(dhpy.class, dhpyVar);
    }

    private dhpy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0002\u0003ဉ\u0001\u0004ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဉ\b\nဉ\t", new Object[]{"k", "a", "c", "b", "d", "e", "f", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new dhpy();
            }
            if (i2 == 4) {
                return new dhpk();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhpy> dssrVar = l;
            if (dssrVar == null) {
                synchronized (dhpy.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
