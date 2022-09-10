package defpackage;
/* compiled from: PG */
/* renamed from: dgxv  reason: default package */
/* loaded from: classes6.dex */
public final class dgxv extends dsqw<dgxv, dgxu> implements dssk {
    public static final dgxv c;
    private static volatile dssr<dgxv> d;
    public int a;
    public dgxx b;

    static {
        dgxv dgxvVar = new dgxv();
        c = dgxvVar;
        dsqw.cc(dgxv.class, dgxvVar);
    }

    private dgxv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dgxv();
            }
            if (i2 == 4) {
                return new dgxu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgxv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgxv.class) {
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
