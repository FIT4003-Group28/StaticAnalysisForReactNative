package defpackage;
/* compiled from: PG */
/* renamed from: dnrh  reason: default package */
/* loaded from: classes6.dex */
public final class dnrh extends dsqw<dnrh, dnrg> implements dssk {
    public static final dnrh a;
    private static volatile dssr<dnrh> b;

    static {
        dnrh dnrhVar = new dnrh();
        a = dnrhVar;
        dsqw.cc(dnrh.class, dnrhVar);
    }

    private dnrh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dnrh();
            }
            if (i2 == 4) {
                return new dnrg();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnrh> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dnrh.class) {
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
