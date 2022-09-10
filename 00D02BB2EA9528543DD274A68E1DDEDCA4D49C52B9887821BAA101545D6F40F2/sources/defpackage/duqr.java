package defpackage;
/* compiled from: PG */
/* renamed from: duqr  reason: default package */
/* loaded from: classes6.dex */
public final class duqr extends dsqw<duqr, duqq> implements dssk {
    public static final duqr g;
    private static volatile dssr<duqr> h;
    public int a;
    public dhjx b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;

    static {
        duqr duqrVar = new duqr();
        g = duqrVar;
        dsqw.cc(duqr.class, duqrVar);
    }

    private duqr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new duqr();
            }
            if (i2 == 4) {
                return new duqq();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duqr> dssrVar = h;
            if (dssrVar == null) {
                synchronized (duqr.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
