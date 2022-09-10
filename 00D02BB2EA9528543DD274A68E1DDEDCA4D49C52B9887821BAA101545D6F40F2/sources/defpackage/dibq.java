package defpackage;
/* compiled from: PG */
/* renamed from: dibq  reason: default package */
/* loaded from: classes6.dex */
public final class dibq extends dsqw<dibq, dibp> implements dssk {
    public static final dibq f;
    private static volatile dssr<dibq> g;
    public int a;
    public dpot b;
    public dspd c = dspd.b;
    public boolean d;
    public dpql e;

    static {
        dibq dibqVar = new dibq();
        f = dibqVar;
        dsqw.cc(dibq.class, dibqVar);
    }

    private dibq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\t\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0004ဉ\u0005\tဇ\u0004", new Object[]{"a", "b", "c", "e", "d"});
            }
            if (i2 == 3) {
                return new dibq();
            }
            if (i2 == 4) {
                return new dibp();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dibq> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dibq.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
