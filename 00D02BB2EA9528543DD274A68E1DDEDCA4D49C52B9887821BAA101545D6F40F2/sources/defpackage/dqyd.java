package defpackage;
/* compiled from: PG */
/* renamed from: dqyd  reason: default package */
/* loaded from: classes6.dex */
public final class dqyd extends dsqw<dqyd, dqyc> implements dssk {
    public static final dqyd d;
    private static volatile dssr<dqyd> e;
    public int a;
    public boolean b;
    public int c;

    static {
        dqyd dqydVar = new dqyd();
        d = dqydVar;
        dsqw.cc(dqyd.class, dqydVar);
    }

    private dqyd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqyd();
            }
            if (i2 == 4) {
                return new dqyc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqyd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqyd.class) {
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
