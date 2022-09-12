package defpackage;
/* compiled from: PG */
/* renamed from: dsay  reason: default package */
/* loaded from: classes6.dex */
public final class dsay extends dsqw<dsay, dsax> implements dssk {
    public static final dsay d;
    private static volatile dssr<dsay> e;
    public int a;
    public int b;
    public drxs c;

    static {
        dsay dsayVar = new dsay();
        d = dsayVar;
        dsqw.cc(dsay.class, dsayVar);
    }

    private dsay() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", drxm.a, "c"});
            }
            if (i2 == 3) {
                return new dsay();
            }
            if (i2 == 4) {
                return new dsax();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsay> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsay.class) {
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
