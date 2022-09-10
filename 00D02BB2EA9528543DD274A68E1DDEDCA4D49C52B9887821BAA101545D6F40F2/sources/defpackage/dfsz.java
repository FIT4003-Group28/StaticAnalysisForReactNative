package defpackage;
/* compiled from: PG */
/* renamed from: dfsz  reason: default package */
/* loaded from: classes6.dex */
public final class dfsz extends dsqw<dfsz, dfsy> implements dssk {
    public static final dfsz e;
    private static volatile dssr<dfsz> f;
    public int a;
    public dftd b;
    public float c;
    public dhjz d;

    static {
        dfsz dfszVar = new dfsz();
        e = dfszVar;
        dsqw.cc(dfsz.class, dfszVar);
    }

    private dfsz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dfsz();
            }
            if (i2 == 4) {
                return new dfsy();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfsz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dfsz.class) {
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
