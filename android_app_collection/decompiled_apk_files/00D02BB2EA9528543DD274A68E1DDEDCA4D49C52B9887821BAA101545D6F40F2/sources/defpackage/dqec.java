package defpackage;
/* compiled from: PG */
/* renamed from: dqec  reason: default package */
/* loaded from: classes6.dex */
public final class dqec extends dsqw<dqec, dqeb> implements dssk {
    public static final dqec a;
    private static volatile dssr<dqec> b;

    static {
        dqec dqecVar = new dqec();
        a = dqecVar;
        dsqw.cc(dqec.class, dqecVar);
    }

    private dqec() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dqec();
            }
            if (i2 == 4) {
                return new dqeb();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqec> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dqec.class) {
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
