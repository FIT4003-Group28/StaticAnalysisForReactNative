package defpackage;
/* compiled from: PG */
/* renamed from: dvsg  reason: default package */
/* loaded from: classes6.dex */
public final class dvsg extends dsqw<dvsg, dvsf> implements dssk {
    public static final dvsg b;
    private static volatile dssr<dvsg> c;
    public dsrj<String> a = dssu.b;

    static {
        dvsg dvsgVar = new dvsg();
        b = dvsgVar;
        dsqw.cc(dvsg.class, dvsgVar);
    }

    private dvsg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dvsg();
            }
            if (i2 == 4) {
                return new dvsf();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvsg> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dvsg.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
