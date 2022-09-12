package defpackage;
/* compiled from: PG */
/* renamed from: dgfp  reason: default package */
/* loaded from: classes6.dex */
public final class dgfp extends dsqw<dgfp, dgfo> implements dssk {
    public static final dgfp c;
    private static volatile dssr<dgfp> e;
    public duhk a;
    public duhk b;
    private int d;

    static {
        dgfp dgfpVar = new dgfp();
        c = dgfpVar;
        dsqw.cc(dgfp.class, dgfpVar);
    }

    private dgfp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dgfp();
            }
            if (i2 == 4) {
                return new dgfo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgfp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgfp.class) {
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
