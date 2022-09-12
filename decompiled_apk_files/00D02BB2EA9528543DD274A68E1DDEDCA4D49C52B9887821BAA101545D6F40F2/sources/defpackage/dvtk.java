package defpackage;
/* compiled from: PG */
/* renamed from: dvtk  reason: default package */
/* loaded from: classes.dex */
public final class dvtk extends dsqw<dvtk, dvtj> implements dssk {
    public static final dvtk g;
    private static volatile dssr<dvtk> i;
    public long a = 33554432;
    public double b = 0.25d;
    public double c = 0.8d;
    public double d = 0.9d;
    public int e = 604800000;
    public long f = 3145728;
    private int h;

    static {
        dvtk dvtkVar = new dvtk();
        g = dvtkVar;
        dsqw.cc(dvtk.class, dvtkVar);
    }

    private dvtk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0000\u0002ဂ\u0001\u0003က\u0002\u0004က\u0003\u0005က\u0004\u0007င\u0006\bဂ\u0007", new Object[]{"h", "a", "b", "c", "d", "e", "f"});
            }
            if (i3 == 3) {
                return new dvtk();
            }
            if (i3 == 4) {
                return new dvtj();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dvtk> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dvtk.class) {
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
