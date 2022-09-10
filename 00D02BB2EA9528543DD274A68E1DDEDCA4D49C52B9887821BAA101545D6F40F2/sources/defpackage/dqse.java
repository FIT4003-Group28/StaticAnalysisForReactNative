package defpackage;
/* compiled from: PG */
/* renamed from: dqse  reason: default package */
/* loaded from: classes6.dex */
public final class dqse extends dsqw<dqse, dqsd> implements dssk {
    public static final dqse d;
    private static volatile dssr<dqse> e;
    public int a;
    public dgaq b;
    public String c = "";

    static {
        dqse dqseVar = new dqse();
        d = dqseVar;
        dsqw.cc(dqse.class, dqseVar);
    }

    private dqse() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqse();
            }
            if (i2 == 4) {
                return new dqsd();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqse> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqse.class) {
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
