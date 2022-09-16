package defpackage;
/* compiled from: PG */
/* renamed from: drbx  reason: default package */
/* loaded from: classes.dex */
public final class drbx extends dsqw<drbx, drbw> implements dssk {
    public static final drbx c;
    private static volatile dssr<drbx> d;
    public int a;
    public String b = "";

    static {
        drbx drbxVar = new drbx();
        c = drbxVar;
        dsqw.cc(drbx.class, drbxVar);
    }

    private drbx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0013\u0013\u0001\u0000\u0000\u0000\u0013ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new drbx();
            }
            if (i2 == 4) {
                return new drbw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drbx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drbx.class) {
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
