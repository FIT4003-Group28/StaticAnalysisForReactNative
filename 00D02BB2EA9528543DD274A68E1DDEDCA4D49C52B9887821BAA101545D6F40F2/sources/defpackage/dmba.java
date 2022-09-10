package defpackage;
/* compiled from: PG */
/* renamed from: dmba  reason: default package */
/* loaded from: classes6.dex */
public final class dmba extends dsqw<dmba, dmaz> implements dssk {
    public static final dmba b;
    private static volatile dssr<dmba> d;
    public String a = "";
    private int c;

    static {
        dmba dmbaVar = new dmba();
        b = dmbaVar;
        dsqw.cc(dmba.class, dmbaVar);
    }

    private dmba() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dmba();
            }
            if (i2 == 4) {
                return new dmaz();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmba> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmba.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
