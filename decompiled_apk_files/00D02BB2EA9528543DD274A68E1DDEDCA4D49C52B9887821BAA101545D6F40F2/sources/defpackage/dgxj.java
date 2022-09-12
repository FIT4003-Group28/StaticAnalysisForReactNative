package defpackage;
/* compiled from: PG */
/* renamed from: dgxj  reason: default package */
/* loaded from: classes6.dex */
public final class dgxj extends dsqw<dgxj, dgxi> implements dssk {
    public static final dgxj e;
    private static volatile dssr<dgxj> f;
    public int a;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        dgxj dgxjVar = new dgxj();
        e = dgxjVar;
        dsqw.cc(dgxj.class, dgxjVar);
    }

    private dgxj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0002\u0001\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ြ\u0000", new Object[]{"c", "b", "a", "d", dtas.class});
            }
            if (i2 == 3) {
                return new dgxj();
            }
            if (i2 == 4) {
                return new dgxi();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgxj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dgxj.class) {
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
