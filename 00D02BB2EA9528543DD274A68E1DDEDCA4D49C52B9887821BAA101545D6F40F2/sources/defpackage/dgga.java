package defpackage;
/* compiled from: PG */
/* renamed from: dgga  reason: default package */
/* loaded from: classes6.dex */
public final class dgga extends dsqw<dgga, dgfz> implements dssk {
    public static final dgga b;
    private static volatile dssr<dgga> d;
    public String a = "";
    private int c;

    static {
        dgga dggaVar = new dgga();
        b = dggaVar;
        dsqw.cc(dgga.class, dggaVar);
    }

    private dgga() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dgga();
            }
            if (i2 == 4) {
                return new dgfz();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgga> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgga.class) {
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
