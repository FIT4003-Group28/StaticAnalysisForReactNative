package defpackage;
/* compiled from: PG */
/* renamed from: dvap  reason: default package */
/* loaded from: classes6.dex */
public final class dvap extends dsqw<dvap, dvao> implements dssk {
    public static final dvap d;
    private static volatile dssr<dvap> e;
    public int a;
    public dngs b;
    public long c;

    static {
        dvap dvapVar = new dvap();
        d = dvapVar;
        dsqw.cc(dvap.class, dvapVar);
    }

    private dvap() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvap();
            }
            if (i2 == 4) {
                return new dvao();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvap> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvap.class) {
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
