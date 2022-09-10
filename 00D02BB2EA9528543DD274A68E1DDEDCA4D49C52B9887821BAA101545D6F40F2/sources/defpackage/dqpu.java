package defpackage;
/* compiled from: PG */
/* renamed from: dqpu  reason: default package */
/* loaded from: classes6.dex */
public final class dqpu extends dsqw<dqpu, dqpt> implements dssk {
    public static final dqpu c;
    private static volatile dssr<dqpu> e;
    public String a = "";
    public dnpq b;
    private int d;

    static {
        dqpu dqpuVar = new dqpu();
        c = dqpuVar;
        dsqw.cc(dqpu.class, dqpuVar);
    }

    private dqpu() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dqpu();
            }
            if (i2 == 4) {
                return new dqpt();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqpu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqpu.class) {
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
