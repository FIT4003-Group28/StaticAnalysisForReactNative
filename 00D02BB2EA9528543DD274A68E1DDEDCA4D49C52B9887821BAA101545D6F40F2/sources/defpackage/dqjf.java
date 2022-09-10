package defpackage;
/* compiled from: PG */
/* renamed from: dqjf  reason: default package */
/* loaded from: classes6.dex */
public final class dqjf extends dsqw<dqjf, dqjd> implements dssk {
    public static final dqjf d;
    private static volatile dssr<dqjf> e;
    public int a;
    public int b;
    public String c = "";

    static {
        dqjf dqjfVar = new dqjf();
        d = dqjfVar;
        dsqw.cc(dqjf.class, dqjfVar);
    }

    private dqjf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", dqje.a, "c"});
            }
            if (i2 == 3) {
                return new dqjf();
            }
            if (i2 == 4) {
                return new dqjd();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqjf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqjf.class) {
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
