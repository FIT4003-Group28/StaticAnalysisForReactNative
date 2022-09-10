package defpackage;
/* compiled from: PG */
/* renamed from: dqbn  reason: default package */
/* loaded from: classes6.dex */
public final class dqbn extends dsqw<dqbn, dqbk> implements dssk {
    public static final dqbn b;
    private static volatile dssr<dqbn> c;
    public dsrj<dqbm> a = dssu.b;

    static {
        dqbn dqbnVar = new dqbn();
        b = dqbnVar;
        dsqw.cc(dqbn.class, dqbnVar);
    }

    private dqbn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dqbm.class});
            }
            if (i2 == 3) {
                return new dqbn();
            }
            if (i2 == 4) {
                return new dqbk();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqbn> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dqbn.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
