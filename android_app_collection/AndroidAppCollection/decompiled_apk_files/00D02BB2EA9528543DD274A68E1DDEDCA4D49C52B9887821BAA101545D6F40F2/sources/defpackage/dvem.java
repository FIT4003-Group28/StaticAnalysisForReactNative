package defpackage;
/* compiled from: PG */
/* renamed from: dvem  reason: default package */
/* loaded from: classes.dex */
public final class dvem extends dsqw<dvem, dvel> implements dssk {
    public static final dvem b;
    private static volatile dssr<dvem> d;
    public String a = "";
    private int c;

    static {
        dvem dvemVar = new dvem();
        b = dvemVar;
        dsqw.cc(dvem.class, dvemVar);
    }

    private dvem() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0003", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dvem();
            }
            if (i2 == 4) {
                return new dvel();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvem> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvem.class) {
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
