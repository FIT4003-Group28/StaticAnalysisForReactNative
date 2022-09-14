package defpackage;
/* compiled from: PG */
/* renamed from: didx  reason: default package */
/* loaded from: classes6.dex */
public final class didx extends dsqw<didx, didw> implements dssk {
    public static final didx c;
    private static volatile dssr<didx> d;
    public int a;
    public String b = "";

    static {
        didx didxVar = new didx();
        c = didxVar;
        dsqw.cc(didx.class, didxVar);
    }

    private didx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new didx();
            }
            if (i2 == 4) {
                return new didw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<didx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (didx.class) {
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
