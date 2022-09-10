package defpackage;
/* compiled from: PG */
/* renamed from: drlh  reason: default package */
/* loaded from: classes6.dex */
public final class drlh extends dsqw<drlh, drlg> implements dssk {
    public static final drlh a;
    private static volatile dssr<drlh> b;

    static {
        drlh drlhVar = new drlh();
        a = drlhVar;
        dsqw.cc(drlh.class, drlhVar);
    }

    private drlh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new drlh();
            }
            if (i2 == 4) {
                return new drlg();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drlh> dssrVar = b;
            if (dssrVar == null) {
                synchronized (drlh.class) {
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
