package defpackage;
/* compiled from: PG */
/* renamed from: dqep  reason: default package */
/* loaded from: classes6.dex */
public final class dqep extends dsqw<dqep, dqen> implements dssk {
    public static final dqep c;
    private static volatile dssr<dqep> d;
    public int a;
    public int b;

    static {
        dqep dqepVar = new dqep();
        c = dqepVar;
        dsqw.cc(dqep.class, dqepVar);
    }

    private dqep() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dqeo.a});
            }
            if (i2 == 3) {
                return new dqep();
            }
            if (i2 == 4) {
                return new dqen();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqep> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqep.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
