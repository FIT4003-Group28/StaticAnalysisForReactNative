package defpackage;
/* compiled from: PG */
/* renamed from: dvsy  reason: default package */
/* loaded from: classes.dex */
public final class dvsy extends dsqw<dvsy, dvsv> implements dssk {
    public static final dvsy i;
    private static volatile dssr<dvsy> j;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f = 7;
    public boolean g;
    public int h;

    static {
        dvsy dvsyVar = new dvsy();
        i = dvsyVar;
        dsqw.cc(dvsy.class, dvsyVar);
    }

    private dvsy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဇ\u0002\u0004ဇ\u0004\u0005င\u0005\u0006ဇ\u0006\u0007ဌ\u0007\tဇ\u0003", new Object[]{"a", "b", "c", "e", "f", "g", "h", dvsw.a, "d"});
            }
            if (i3 == 3) {
                return new dvsy();
            }
            if (i3 == 4) {
                return new dvsv();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dvsy> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dvsy.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
