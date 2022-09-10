package defpackage;
/* compiled from: PG */
/* renamed from: dgsl  reason: default package */
/* loaded from: classes.dex */
public final class dgsl extends dsqw<dgsl, dgsk> implements dssk {
    public static final dgsl b;
    private static volatile dssr<dgsl> c;
    public dsrj<dgrz> a = dssu.b;

    static {
        dgsl dgslVar = new dgsl();
        b = dgslVar;
        dsqw.cc(dgsl.class, dgslVar);
    }

    private dgsl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dgrz.class});
            }
            if (i2 == 3) {
                return new dgsl();
            }
            if (i2 == 4) {
                return new dgsk();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgsl> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dgsl.class) {
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
