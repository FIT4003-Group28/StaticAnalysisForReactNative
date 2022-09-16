package defpackage;
/* compiled from: PG */
/* renamed from: dfdj  reason: default package */
/* loaded from: classes6.dex */
public final class dfdj extends dsqw<dfdj, dfdi> implements dssk {
    public static final dfdj d;
    private static volatile dssr<dfdj> e;
    public int a;
    public dfdl b;
    public dfdr c;

    static {
        dfdj dfdjVar = new dfdj();
        d = dfdjVar;
        dsqw.cc(dfdj.class, dfdjVar);
    }

    private dfdj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0006\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0006ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dfdj();
            }
            if (i2 == 4) {
                return new dfdi();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfdj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfdj.class) {
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
