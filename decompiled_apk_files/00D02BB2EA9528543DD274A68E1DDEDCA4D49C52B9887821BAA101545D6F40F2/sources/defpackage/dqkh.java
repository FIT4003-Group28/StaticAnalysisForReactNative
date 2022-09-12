package defpackage;
/* compiled from: PG */
/* renamed from: dqkh  reason: default package */
/* loaded from: classes6.dex */
public final class dqkh extends dsqw<dqkh, dqkg> implements dssk {
    public static final dqkh a;
    private static volatile dssr<dqkh> b;

    static {
        dqkh dqkhVar = new dqkh();
        a = dqkhVar;
        dsqw.cc(dqkh.class, dqkhVar);
    }

    private dqkh() {
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
                return new dqkh();
            }
            if (i2 == 4) {
                return new dqkg();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqkh> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dqkh.class) {
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
