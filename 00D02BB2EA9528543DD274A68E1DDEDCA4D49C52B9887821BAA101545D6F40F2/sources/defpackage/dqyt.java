package defpackage;
/* compiled from: PG */
/* renamed from: dqyt  reason: default package */
/* loaded from: classes6.dex */
public final class dqyt extends dsqw<dqyt, dqys> implements dssk {
    public static final dqyt b;
    private static volatile dssr<dqyt> d;
    public String a = "";
    private int c;

    static {
        dqyt dqytVar = new dqyt();
        b = dqytVar;
        dsqw.cc(dqyt.class, dqytVar);
    }

    private dqyt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dqyt();
            }
            if (i2 == 4) {
                return new dqys();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqyt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqyt.class) {
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
