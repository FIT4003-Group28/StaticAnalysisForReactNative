package defpackage;
/* compiled from: PG */
/* renamed from: dukh  reason: default package */
/* loaded from: classes.dex */
public final class dukh extends dsqw<dukh, dukg> implements dssk {
    public static final dukh a;
    private static volatile dssr<dukh> b;

    static {
        dukh dukhVar = new dukh();
        a = dukhVar;
        dsqw.cc(dukh.class, dukhVar);
    }

    private dukh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dukh();
            }
            if (i2 == 4) {
                return new dukg();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dukh> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dukh.class) {
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
