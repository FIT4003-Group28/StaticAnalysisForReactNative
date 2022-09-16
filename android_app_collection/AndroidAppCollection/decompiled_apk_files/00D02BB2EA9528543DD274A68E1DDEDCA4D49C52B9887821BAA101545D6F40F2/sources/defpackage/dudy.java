package defpackage;
/* compiled from: PG */
/* renamed from: dudy  reason: default package */
/* loaded from: classes6.dex */
public final class dudy extends dsqw<dudy, dudt> implements dssk {
    public static final dudy d;
    private static volatile dssr<dudy> e;
    public int a;
    public int b;
    public dsrj<dudx> c = dssu.b;

    static {
        dudy dudyVar = new dudy();
        d = dudyVar;
        dsqw.cc(dudy.class, dudyVar);
    }

    private dudy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001င\u0000\u0003\u001b", new Object[]{"a", "b", "c", dudx.class});
            }
            if (i2 == 3) {
                return new dudy();
            }
            if (i2 == 4) {
                return new dudt();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dudy> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dudy.class) {
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
