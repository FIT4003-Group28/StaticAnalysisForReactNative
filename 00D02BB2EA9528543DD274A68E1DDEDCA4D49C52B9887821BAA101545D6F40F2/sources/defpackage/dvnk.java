package defpackage;
/* compiled from: PG */
/* renamed from: dvnk  reason: default package */
/* loaded from: classes6.dex */
public final class dvnk extends dsqw<dvnk, dvnj> implements dssk {
    public static final dvnk b;
    private static volatile dssr<dvnk> d;
    public boolean a;
    private int c;

    static {
        dvnk dvnkVar = new dvnk();
        b = dvnkVar;
        dsqw.cc(dvnk.class, dvnkVar);
    }

    private dvnk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dvnk();
            }
            if (i2 == 4) {
                return new dvnj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvnk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvnk.class) {
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
