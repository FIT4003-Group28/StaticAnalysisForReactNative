package defpackage;
/* compiled from: PG */
/* renamed from: ddss  reason: default package */
/* loaded from: classes6.dex */
public final class ddss extends dsqw<ddss, ddsr> implements dssk {
    public static final ddss d;
    private static volatile dssr<ddss> e;
    public int a;
    public boolean b;
    public int c;

    static {
        ddss ddssVar = new ddss();
        d = ddssVar;
        dsqw.cc(ddss.class, ddssVar);
    }

    private ddss() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddss();
            }
            if (i2 == 4) {
                return new ddsr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddss> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddss.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
