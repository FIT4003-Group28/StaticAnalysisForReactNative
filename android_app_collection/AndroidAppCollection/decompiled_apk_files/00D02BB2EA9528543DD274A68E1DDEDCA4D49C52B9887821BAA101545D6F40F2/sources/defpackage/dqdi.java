package defpackage;
/* compiled from: PG */
/* renamed from: dqdi  reason: default package */
/* loaded from: classes6.dex */
public final class dqdi extends dsqw<dqdi, dqdh> implements dssk {
    public static final dqdi e;
    private static volatile dssr<dqdi> g;
    public boolean a;
    public boolean b;
    public String c = "";
    public String d = "";
    private int f;

    static {
        dqdi dqdiVar = new dqdi();
        e = dqdiVar;
        dsqw.cc(dqdi.class, dqdiVar);
    }

    private dqdi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dqdi();
            }
            if (i2 == 4) {
                return new dqdh();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqdi> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dqdi.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
