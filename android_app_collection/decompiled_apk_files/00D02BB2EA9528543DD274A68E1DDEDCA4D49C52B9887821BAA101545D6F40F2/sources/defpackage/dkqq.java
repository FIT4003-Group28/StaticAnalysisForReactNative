package defpackage;
/* compiled from: PG */
/* renamed from: dkqq  reason: default package */
/* loaded from: classes.dex */
public final class dkqq extends dsqw<dkqq, dkqp> implements dssk {
    public static final dkqq b;
    private static volatile dssr<dkqq> d;
    public boolean a;
    private int c;

    static {
        dkqq dkqqVar = new dkqq();
        b = dkqqVar;
        dsqw.cc(dkqq.class, dkqqVar);
    }

    private dkqq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dkqq();
            }
            if (i2 == 4) {
                return new dkqp();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkqq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkqq.class) {
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
