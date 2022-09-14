package defpackage;
/* compiled from: PG */
/* renamed from: dgcs  reason: default package */
/* loaded from: classes6.dex */
public final class dgcs extends dsqw<dgcs, dgcr> implements dssk {
    public static final dgcs b;
    private static volatile dssr<dgcs> c;
    public dsrj<dgcm> a = dssu.b;

    static {
        dgcs dgcsVar = new dgcs();
        b = dgcsVar;
        dsqw.cc(dgcs.class, dgcsVar);
    }

    private dgcs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dgcm.class});
            }
            if (i2 == 3) {
                return new dgcs();
            }
            if (i2 == 4) {
                return new dgcr();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgcs> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dgcs.class) {
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
