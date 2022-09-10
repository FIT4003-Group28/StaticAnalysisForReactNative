package defpackage;
/* compiled from: PG */
/* renamed from: dvxt  reason: default package */
/* loaded from: classes6.dex */
public final class dvxt extends dsqw<dvxt, dvxo> implements dssk {
    public static final dvxt e;
    private static volatile dssr<dvxt> f;
    public int a;
    public dvxs b;
    public int c;
    public dvxq d;

    static {
        dvxt dvxtVar = new dvxt();
        e = dvxtVar;
        dsqw.cc(dvxt.class, dvxtVar);
    }

    private dvxt() {
        dsqz dsqzVar = dsqz.b;
        this.c = 3;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ဉ\u0000\u0003င\u0001\u0005ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dvxt();
            }
            if (i2 == 4) {
                return new dvxo();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvxt> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvxt.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
