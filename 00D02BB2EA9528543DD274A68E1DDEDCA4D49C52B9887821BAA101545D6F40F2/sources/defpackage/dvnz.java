package defpackage;
/* compiled from: PG */
/* renamed from: dvnz  reason: default package */
/* loaded from: classes.dex */
public final class dvnz extends dsqw<dvnz, dvny> implements dssk {
    public static final dvnz g;
    private static volatile dssr<dvnz> i;
    public boolean a;
    public boolean e;
    private int h;
    public int b = 600;
    public int c = 86400;
    public int d = 1800;
    public int f = 86400;

    static {
        dvnz dvnzVar = new dvnz();
        g = dvnzVar;
        dsqw.cc(dvnz.class, dvnzVar);
    }

    private dvnz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဇ\u0004\u0006င\u0005", new Object[]{"h", "a", "b", "c", "d", "e", "f"});
            }
            if (i3 == 3) {
                return new dvnz();
            }
            if (i3 == 4) {
                return new dvny();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dvnz> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dvnz.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
