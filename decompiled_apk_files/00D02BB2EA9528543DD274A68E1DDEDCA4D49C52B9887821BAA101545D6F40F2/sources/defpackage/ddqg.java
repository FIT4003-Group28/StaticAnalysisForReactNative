package defpackage;
/* compiled from: PG */
/* renamed from: ddqg  reason: default package */
/* loaded from: classes6.dex */
public final class ddqg extends dsqw<ddqg, ddqd> implements dssk {
    public static final ddqg d;
    private static volatile dssr<ddqg> e;
    public int a;
    public ddqf b;
    public ddqf c;

    static {
        ddqg ddqgVar = new ddqg();
        d = ddqgVar;
        dsqw.cc(ddqg.class, ddqgVar);
    }

    private ddqg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddqg();
            }
            if (i2 == 4) {
                return new ddqd();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddqg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddqg.class) {
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
