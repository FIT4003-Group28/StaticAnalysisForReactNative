package defpackage;
/* compiled from: PG */
/* renamed from: drqm  reason: default package */
/* loaded from: classes6.dex */
public final class drqm extends dsqw<drqm, drql> implements dssk {
    public static final drqm a;
    private static volatile dssr<drqm> b;

    static {
        drqm drqmVar = new drqm();
        a = drqmVar;
        dsqw.cc(drqm.class, drqmVar);
    }

    private drqm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new drqm();
            }
            if (i2 == 4) {
                return new drql();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drqm> dssrVar = b;
            if (dssrVar == null) {
                synchronized (drqm.class) {
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
