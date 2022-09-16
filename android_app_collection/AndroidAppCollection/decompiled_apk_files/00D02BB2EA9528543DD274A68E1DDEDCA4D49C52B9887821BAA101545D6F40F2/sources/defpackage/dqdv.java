package defpackage;
/* compiled from: PG */
/* renamed from: dqdv  reason: default package */
/* loaded from: classes6.dex */
public final class dqdv extends dsqw<dqdv, dqdu> implements dssk {
    public static final dqdv b;
    private static volatile dssr<dqdv> d;
    public String a = "";
    private int c;

    static {
        dqdv dqdvVar = new dqdv();
        b = dqdvVar;
        dsqw.cc(dqdv.class, dqdvVar);
    }

    private dqdv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dqdv();
            }
            if (i2 == 4) {
                return new dqdu();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqdv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqdv.class) {
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
