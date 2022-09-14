package defpackage;
/* compiled from: PG */
/* renamed from: dgcm  reason: default package */
/* loaded from: classes6.dex */
public final class dgcm extends dsqw<dgcm, dgcl> implements dssk {
    public static final dgcm c;
    private static volatile dssr<dgcm> e;
    public int a;
    public dsrj<dgck> b = dssu.b;
    private int d;

    static {
        dgcm dgcmVar = new dgcm();
        c = dgcmVar;
        dsqw.cc(dgcm.class, dgcmVar);
    }

    private dgcm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"d", "a", dgcn.a, "b", dgck.class});
            }
            if (i2 == 3) {
                return new dgcm();
            }
            if (i2 == 4) {
                return new dgcl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgcm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgcm.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
