package defpackage;
/* compiled from: PG */
/* renamed from: dftj  reason: default package */
/* loaded from: classes6.dex */
public final class dftj extends dsqw<dftj, dfti> implements dssk {
    public static final dftj f;
    private static volatile dssr<dftj> g;
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;

    static {
        dftj dftjVar = new dftj();
        f = dftjVar;
        dsqw.cc(dftj.class, dftjVar);
    }

    private dftj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dftj();
            }
            if (i2 == 4) {
                return new dfti();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dftj> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dftj.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
