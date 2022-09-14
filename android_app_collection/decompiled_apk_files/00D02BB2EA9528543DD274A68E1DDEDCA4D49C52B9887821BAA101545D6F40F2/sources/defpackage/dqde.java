package defpackage;
/* compiled from: PG */
/* renamed from: dqde  reason: default package */
/* loaded from: classes6.dex */
public final class dqde extends dsqw<dqde, dqdd> implements dssk {
    public static final dqde a;
    private static volatile dssr<dqde> b;

    static {
        dqde dqdeVar = new dqde();
        a = dqdeVar;
        dsqw.cc(dqde.class, dqdeVar);
    }

    private dqde() {
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
                return new dqde();
            }
            if (i2 == 4) {
                return new dqdd();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqde> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dqde.class) {
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
