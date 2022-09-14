package defpackage;
/* compiled from: PG */
/* renamed from: drqh  reason: default package */
/* loaded from: classes6.dex */
public final class drqh extends dsqw<drqh, drqg> implements dssk {
    public static final drqh a;
    private static volatile dssr<drqh> b;

    static {
        drqh drqhVar = new drqh();
        a = drqhVar;
        dsqw.cc(drqh.class, drqhVar);
    }

    private drqh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new drqh();
            }
            if (i2 == 4) {
                return new drqg();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drqh> dssrVar = b;
            if (dssrVar == null) {
                synchronized (drqh.class) {
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
