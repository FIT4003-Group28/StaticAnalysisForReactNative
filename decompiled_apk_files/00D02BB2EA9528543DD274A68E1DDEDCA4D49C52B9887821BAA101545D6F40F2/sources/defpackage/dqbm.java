package defpackage;
/* compiled from: PG */
/* renamed from: dqbm  reason: default package */
/* loaded from: classes6.dex */
public final class dqbm extends dsqw<dqbm, dqbl> implements dssk {
    public static final dqbm c;
    private static volatile dssr<dqbm> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        dqbm dqbmVar = new dqbm();
        c = dqbmVar;
        dsqw.cc(dqbm.class, dqbmVar);
    }

    private dqbm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dqbm();
            }
            if (i2 == 4) {
                return new dqbl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqbm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqbm.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
