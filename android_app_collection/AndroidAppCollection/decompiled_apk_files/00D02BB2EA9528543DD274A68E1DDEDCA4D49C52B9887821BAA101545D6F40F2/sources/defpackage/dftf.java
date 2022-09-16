package defpackage;
/* compiled from: PG */
/* renamed from: dftf  reason: default package */
/* loaded from: classes6.dex */
public final class dftf extends dsqw<dftf, dfte> implements dssk {
    public static final dftf d;
    private static volatile dssr<dftf> f;
    public dftd a;
    public float b;
    public dhjx c;
    private int e;

    static {
        dftf dftfVar = new dftf();
        d = dftfVar;
        dsqw.cc(dftf.class, dftfVar);
    }

    private dftf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dftf();
            }
            if (i2 == 4) {
                return new dfte();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dftf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dftf.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
