package defpackage;
/* compiled from: PG */
/* renamed from: dvdf  reason: default package */
/* loaded from: classes.dex */
public final class dvdf extends dsqw<dvdf, dvde> implements dvdg {
    public static final dvdf d;
    private static volatile dssr<dvdf> e;
    public int a;
    public dvdp b;
    public dvdi c;

    static {
        dvdf dvdfVar = new dvdf();
        d = dvdfVar;
        dsqw.cc(dvdf.class, dvdfVar);
    }

    private dvdf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvdf();
            }
            if (i2 == 4) {
                return new dvde();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvdf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvdf.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
