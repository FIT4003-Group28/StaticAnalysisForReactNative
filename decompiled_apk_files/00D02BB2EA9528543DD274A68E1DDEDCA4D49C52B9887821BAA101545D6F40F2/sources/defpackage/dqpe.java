package defpackage;
/* compiled from: PG */
/* renamed from: dqpe  reason: default package */
/* loaded from: classes.dex */
public final class dqpe extends dsqw<dqpe, dqpd> implements dssk {
    public static final dqpe f;
    private static volatile dssr<dqpe> g;
    public int a;
    public int b;
    public dqpc c;
    public dqpc d;
    public String e = "";

    static {
        dqpe dqpeVar = new dqpe();
        f = dqpeVar;
        dsqw.cc(dqpe.class, dqpeVar);
    }

    private dqpe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dqpe();
            }
            if (i2 == 4) {
                return new dqpd();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqpe> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dqpe.class) {
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
