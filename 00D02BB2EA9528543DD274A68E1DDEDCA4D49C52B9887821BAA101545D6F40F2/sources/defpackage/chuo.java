package defpackage;
/* compiled from: PG */
/* renamed from: chuo  reason: default package */
/* loaded from: classes4.dex */
public final class chuo extends dsqw<chuo, chun> implements dssk {
    public static final chuo d;
    private static volatile dssr<chuo> e;
    public int a;
    public chxr b;
    public int c;

    static {
        chuo chuoVar = new chuo();
        d = chuoVar;
        dsqw.cc(chuo.class, chuoVar);
    }

    private chuo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new chuo();
            }
            if (i2 == 4) {
                return new chun();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chuo> dssrVar = e;
            if (dssrVar == null) {
                synchronized (chuo.class) {
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
