package defpackage;
/* compiled from: PG */
/* renamed from: diyt  reason: default package */
/* loaded from: classes.dex */
public final class diyt extends dsqw<diyt, diys> implements dssk {
    public static final diyt c;
    private static volatile dssr<diyt> d;
    public dsrj<djrz> a;
    public dsrj<dnpq> b;

    static {
        diyt diytVar = new diyt();
        c = diytVar;
        dsqw.cc(diyt.class, diytVar);
    }

    private diyt() {
        dssu<Object> dssuVar = dssu.b;
        this.a = dssu.b;
        this.b = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0002\u0006\u0002\u0000\u0002\u0000\u0002\u001b\u0006\u001b", new Object[]{"a", djrz.class, "b", dnpq.class});
            }
            if (i2 == 3) {
                return new diyt();
            }
            if (i2 == 4) {
                return new diys();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diyt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (diyt.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
