package defpackage;
/* compiled from: PG */
/* renamed from: dpyl  reason: default package */
/* loaded from: classes6.dex */
public final class dpyl extends dsqw<dpyl, dpyi> implements dssk {
    public static final dpyl c;
    private static volatile dssr<dpyl> e;
    public String a = "";
    public dsrj<dpyk> b = dssu.b;
    private int d;

    static {
        dpyl dpylVar = new dpyl();
        c = dpylVar;
        dsqw.cc(dpyl.class, dpylVar);
    }

    private dpyl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", dpyk.class});
            }
            if (i2 == 3) {
                return new dpyl();
            }
            if (i2 == 4) {
                return new dpyi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpyl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpyl.class) {
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
