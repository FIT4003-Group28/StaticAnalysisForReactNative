package defpackage;
/* compiled from: PG */
/* renamed from: dbnq  reason: default package */
/* loaded from: classes5.dex */
public final class dbnq extends dsqw<dbnq, dbnp> implements dssk {
    public static final dbnq a;
    private static volatile dssr<dbnq> b;

    static {
        dbnq dbnqVar = new dbnq();
        a = dbnqVar;
        dsqw.cc(dbnq.class, dbnqVar);
    }

    private dbnq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dbnq();
            }
            if (i2 == 4) {
                return new dbnp();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbnq> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dbnq.class) {
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
