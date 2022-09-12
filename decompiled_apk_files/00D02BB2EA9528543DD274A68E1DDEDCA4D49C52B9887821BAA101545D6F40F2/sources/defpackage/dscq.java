package defpackage;
/* compiled from: PG */
/* renamed from: dscq  reason: default package */
/* loaded from: classes6.dex */
public final class dscq extends dsqw<dscq, dscp> implements dssk {
    public static final dscq a;
    private static volatile dssr<dscq> b;

    static {
        dscq dscqVar = new dscq();
        a = dscqVar;
        dsqw.cc(dscq.class, dscqVar);
    }

    private dscq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dscq();
            }
            if (i2 == 4) {
                return new dscp();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dscq> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dscq.class) {
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
