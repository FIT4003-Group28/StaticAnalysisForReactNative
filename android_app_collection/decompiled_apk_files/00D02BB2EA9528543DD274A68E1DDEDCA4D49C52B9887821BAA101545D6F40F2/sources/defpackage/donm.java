package defpackage;
/* compiled from: PG */
/* renamed from: donm  reason: default package */
/* loaded from: classes6.dex */
public final class donm extends dsqw<donm, donl> implements dssk {
    public static final donm c;
    private static volatile dssr<donm> d;
    public int a;
    public dong b;

    static {
        donm donmVar = new donm();
        c = donmVar;
        dsqw.cc(donm.class, donmVar);
    }

    private donm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new donm();
            }
            if (i2 == 4) {
                return new donl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<donm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (donm.class) {
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
