package defpackage;
/* compiled from: PG */
/* renamed from: dqrh  reason: default package */
/* loaded from: classes6.dex */
public final class dqrh extends dsqw<dqrh, dqrg> implements dssk {
    public static final dqrh a;
    private static volatile dssr<dqrh> b;

    static {
        dqrh dqrhVar = new dqrh();
        a = dqrhVar;
        dsqw.cc(dqrh.class, dqrhVar);
    }

    private dqrh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dqrh();
            }
            if (i2 == 4) {
                return new dqrg();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqrh> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dqrh.class) {
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
