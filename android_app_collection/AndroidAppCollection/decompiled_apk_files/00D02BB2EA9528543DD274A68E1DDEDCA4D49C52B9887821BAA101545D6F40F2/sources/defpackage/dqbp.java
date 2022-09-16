package defpackage;
/* compiled from: PG */
/* renamed from: dqbp  reason: default package */
/* loaded from: classes6.dex */
public final class dqbp extends dsqw<dqbp, dqbo> implements dssk {
    public static final dqbp a;
    private static volatile dssr<dqbp> b;

    static {
        dqbp dqbpVar = new dqbp();
        a = dqbpVar;
        dsqw.cc(dqbp.class, dqbpVar);
    }

    private dqbp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dqbp();
            }
            if (i2 == 4) {
                return new dqbo();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqbp> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dqbp.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
