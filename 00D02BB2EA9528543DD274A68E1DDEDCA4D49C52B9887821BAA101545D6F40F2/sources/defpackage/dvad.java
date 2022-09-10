package defpackage;
/* compiled from: PG */
/* renamed from: dvad  reason: default package */
/* loaded from: classes6.dex */
public final class dvad extends dsqw<dvad, dvac> implements dssk {
    public static final dvad b;
    private static volatile dssr<dvad> d;
    public int a;
    private int c;

    static {
        dvad dvadVar = new dvad();
        b = dvadVar;
        dsqw.cc(dvad.class, dvadVar);
    }

    private dvad() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dvad();
            }
            if (i2 == 4) {
                return new dvac();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvad> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvad.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
