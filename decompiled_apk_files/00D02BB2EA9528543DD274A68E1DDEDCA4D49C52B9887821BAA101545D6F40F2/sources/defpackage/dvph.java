package defpackage;
/* compiled from: PG */
/* renamed from: dvph  reason: default package */
/* loaded from: classes6.dex */
public final class dvph extends dsqw<dvph, dvpg> implements dssk {
    public static final dvph a;
    private static volatile dssr<dvph> b;

    static {
        dvph dvphVar = new dvph();
        a = dvphVar;
        dsqw.cc(dvph.class, dvphVar);
    }

    private dvph() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dvph();
            }
            if (i2 == 4) {
                return new dvpg();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvph> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dvph.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
