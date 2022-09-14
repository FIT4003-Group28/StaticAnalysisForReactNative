package defpackage;
/* compiled from: PG */
/* renamed from: dtao  reason: default package */
/* loaded from: classes6.dex */
public final class dtao extends dsqw<dtao, dtan> implements dssk {
    public static final dtao e;
    private static volatile dssr<dtao> f;
    public int a;
    public int b;
    public int c;
    public String d = "";

    static {
        dtao dtaoVar = new dtao();
        e = dtaoVar;
        dsqw.cc(dtao.class, dtaoVar);
    }

    private dtao() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0003\t\u0003\u0000\u0000\u0000\u0003င\u0001\u0004င\u0003\tဈ\t", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dtao();
            }
            if (i2 == 4) {
                return new dtan();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtao> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtao.class) {
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
