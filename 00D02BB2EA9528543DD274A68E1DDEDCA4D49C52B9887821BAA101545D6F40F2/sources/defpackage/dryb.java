package defpackage;
/* compiled from: PG */
/* renamed from: dryb  reason: default package */
/* loaded from: classes6.dex */
public final class dryb extends dsqw<dryb, drya> implements dssk {
    public static final dryb a;
    private static volatile dssr<dryb> b;

    static {
        dryb drybVar = new dryb();
        a = drybVar;
        dsqw.cc(dryb.class, drybVar);
    }

    private dryb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dryb();
            }
            if (i2 == 4) {
                return new drya();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dryb> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dryb.class) {
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
