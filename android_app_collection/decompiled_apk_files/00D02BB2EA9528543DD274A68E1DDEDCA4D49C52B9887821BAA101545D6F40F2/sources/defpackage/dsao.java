package defpackage;
/* compiled from: PG */
/* renamed from: dsao  reason: default package */
/* loaded from: classes6.dex */
public final class dsao extends dsqw<dsao, dsam> implements dssk {
    public static final dsao e;
    private static volatile dssr<dsao> f;
    public int a;
    public String b = "";
    public String c = "";
    public int d;

    static {
        dsao dsaoVar = new dsao();
        e = dsaoVar;
        dsqw.cc(dsao.class, dsaoVar);
    }

    private dsao() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", dsan.a});
            }
            if (i2 == 3) {
                return new dsao();
            }
            if (i2 == 4) {
                return new dsam();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsao> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dsao.class) {
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
