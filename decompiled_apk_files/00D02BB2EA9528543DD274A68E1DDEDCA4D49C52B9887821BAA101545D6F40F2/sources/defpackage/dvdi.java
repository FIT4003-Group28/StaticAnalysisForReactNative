package defpackage;
/* compiled from: PG */
/* renamed from: dvdi  reason: default package */
/* loaded from: classes.dex */
public final class dvdi extends dsqw<dvdi, dvdh> implements dvdj {
    public static final dvdi d;
    private static volatile dssr<dvdi> e;
    public int a;
    public float b;
    public float c;

    static {
        dvdi dvdiVar = new dvdi();
        d = dvdiVar;
        dsqw.cc(dvdi.class, dvdiVar);
    }

    private dvdi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvdi();
            }
            if (i2 == 4) {
                return new dvdh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvdi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvdi.class) {
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
