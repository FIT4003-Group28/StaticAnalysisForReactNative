package defpackage;
/* compiled from: PG */
/* renamed from: dpyp  reason: default package */
/* loaded from: classes.dex */
public final class dpyp extends dsqw<dpyp, dpyo> implements dssk {
    public static final dpyp c;
    private static volatile dssr<dpyp> e;
    public dpvg a;
    public String b = "";
    private int d;

    static {
        dpyp dpypVar = new dpyp();
        c = dpypVar;
        dsqw.cc(dpyp.class, dpypVar);
    }

    private dpyp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dpyp();
            }
            if (i2 == 4) {
                return new dpyo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpyp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpyp.class) {
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
