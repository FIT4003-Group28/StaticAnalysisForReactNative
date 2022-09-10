package defpackage;
/* compiled from: PG */
/* renamed from: dftv  reason: default package */
/* loaded from: classes6.dex */
public final class dftv extends dsqw<dftv, dftu> implements dssk {
    public static final dftv e;
    private static volatile dssr<dftv> f;
    public int a;
    public dftd b;
    public dhjz c;
    public dsrf d = dsqz.b;

    static {
        dftv dftvVar = new dftv();
        e = dftvVar;
        dsqw.cc(dftv.class, dftvVar);
    }

    private dftv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001d", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dftv();
            }
            if (i2 == 4) {
                return new dftu();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dftv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dftv.class) {
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
