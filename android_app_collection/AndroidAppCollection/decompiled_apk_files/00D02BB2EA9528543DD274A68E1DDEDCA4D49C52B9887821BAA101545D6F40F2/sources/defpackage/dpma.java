package defpackage;
/* compiled from: PG */
/* renamed from: dpma  reason: default package */
/* loaded from: classes6.dex */
public final class dpma extends dsqw<dpma, dplz> implements dssk {
    public static final dpma c;
    private static volatile dssr<dpma> d;
    public int a;
    public String b = "";

    static {
        dpma dpmaVar = new dpma();
        c = dpmaVar;
        dsqw.cc(dpma.class, dpmaVar);
    }

    private dpma() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dpma();
            }
            if (i2 == 4) {
                return new dplz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpma> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpma.class) {
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
