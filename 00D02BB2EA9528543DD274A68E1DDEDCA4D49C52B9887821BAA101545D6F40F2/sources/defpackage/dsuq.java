package defpackage;
/* compiled from: PG */
/* renamed from: dsuq  reason: default package */
/* loaded from: classes6.dex */
public final class dsuq extends dsqw<dsuq, dsup> implements dssk {
    public static final dsuq a;
    private static volatile dssr<dsuq> b;

    static {
        dsuq dsuqVar = new dsuq();
        a = dsuqVar;
        dsqw.cc(dsuq.class, dsuqVar);
    }

    private dsuq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dsuq();
            }
            if (i2 == 4) {
                return new dsup();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsuq> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dsuq.class) {
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
