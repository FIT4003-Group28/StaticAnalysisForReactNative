package defpackage;
/* compiled from: PG */
/* renamed from: duqx  reason: default package */
/* loaded from: classes6.dex */
public final class duqx extends dsqw<duqx, duqw> implements dssk {
    public static final duqx e;
    private static volatile dssr<duqx> g;
    public String a = "";
    public String b = "";
    public String c = "";
    public int d;
    private int f;

    static {
        duqx duqxVar = new duqx();
        e = duqxVar;
        dsqw.cc(duqx.class, duqxVar);
    }

    private duqx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဌ\u0004", new Object[]{"f", "a", "b", "c", "d", duqu.a});
            }
            if (i2 == 3) {
                return new duqx();
            }
            if (i2 == 4) {
                return new duqw();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duqx> dssrVar = g;
            if (dssrVar == null) {
                synchronized (duqx.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
