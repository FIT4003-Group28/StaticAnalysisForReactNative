package defpackage;
/* compiled from: PG */
/* renamed from: dgay  reason: default package */
/* loaded from: classes6.dex */
public final class dgay extends dsqw<dgay, dgax> implements dssk {
    public static final dgay c;
    private static volatile dssr<dgay> d;
    public int a;
    public int b;

    static {
        dgay dgayVar = new dgay();
        c = dgayVar;
        dsqw.cc(dgay.class, dgayVar);
    }

    private dgay() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dgay();
            }
            if (i2 == 4) {
                return new dgax();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgay> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgay.class) {
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
