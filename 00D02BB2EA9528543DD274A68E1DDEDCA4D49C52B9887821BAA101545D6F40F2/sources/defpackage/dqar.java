package defpackage;
/* compiled from: PG */
/* renamed from: dqar  reason: default package */
/* loaded from: classes6.dex */
public final class dqar extends dsqw<dqar, dqaq> implements dssk {
    public static final dqar d;
    private static volatile dssr<dqar> f;
    public String a = "";
    public String b = "";
    public dnoj c;
    private int e;

    static {
        dqar dqarVar = new dqar();
        d = dqarVar;
        dsqw.cc(dqar.class, dqarVar);
    }

    private dqar() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqar();
            }
            if (i2 == 4) {
                return new dqaq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqar> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqar.class) {
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
