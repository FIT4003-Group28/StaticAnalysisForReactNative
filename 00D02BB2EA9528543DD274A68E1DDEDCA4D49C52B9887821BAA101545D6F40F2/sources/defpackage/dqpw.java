package defpackage;
/* compiled from: PG */
/* renamed from: dqpw  reason: default package */
/* loaded from: classes6.dex */
public final class dqpw extends dsqw<dqpw, dqpv> implements dssk {
    public static final dqpw d;
    private static volatile dssr<dqpw> f;
    public dqpo b;
    private int e;
    public String a = "";
    public dsrj<dqps> c = dssu.b;

    static {
        dqpw dqpwVar = new dqpw();
        d = dqpwVar;
        dsqw.cc(dqpw.class, dqpwVar);
    }

    private dqpw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"e", "a", "c", dqps.class, "b"});
            }
            if (i2 == 3) {
                return new dqpw();
            }
            if (i2 == 4) {
                return new dqpv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqpw> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqpw.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
