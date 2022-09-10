package defpackage;
/* compiled from: PG */
/* renamed from: dpus  reason: default package */
/* loaded from: classes6.dex */
public final class dpus extends dsqw<dpus, dpur> implements dssk {
    public static final dpus b;
    private static volatile dssr<dpus> d;
    public String a = "";
    private int c;

    static {
        dpus dpusVar = new dpus();
        b = dpusVar;
        dsqw.cc(dpus.class, dpusVar);
    }

    private dpus() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dpus();
            }
            if (i2 == 4) {
                return new dpur();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpus> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpus.class) {
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
