package defpackage;
/* compiled from: PG */
/* renamed from: dvlu  reason: default package */
/* loaded from: classes6.dex */
public final class dvlu extends dsqw<dvlu, dvlt> implements dssk {
    public static final dvlu e;
    private static volatile dssr<dvlu> f;
    public int a;
    public int b;
    public dsrj<dwfl> c = dssu.b;
    public dspd d = dspd.b;

    static {
        dvlu dvluVar = new dvlu();
        e = dvluVar;
        dsqw.cc(dvlu.class, dvluVar);
    }

    private dvlu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0001\u0000\u0002င\u0000\u0004\u001b\u0005ည\u0001", new Object[]{"a", "b", "c", dwfl.class, "d"});
            }
            if (i2 == 3) {
                return new dvlu();
            }
            if (i2 == 4) {
                return new dvlt();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvlu> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvlu.class) {
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
