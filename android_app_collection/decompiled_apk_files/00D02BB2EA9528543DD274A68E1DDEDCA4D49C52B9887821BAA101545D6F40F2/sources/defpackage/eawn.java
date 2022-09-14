package defpackage;
/* compiled from: PG */
/* renamed from: eawn  reason: default package */
/* loaded from: classes6.dex */
public final class eawn extends dsqw<eawn, eawm> implements dssk {
    public static final eawn d;
    private static volatile dssr<eawn> e;
    public int a;
    public int b;
    public int c;

    static {
        eawn eawnVar = new eawn();
        d = eawnVar;
        dsqw.cc(eawn.class, eawnVar);
    }

    private eawn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဌ\u0006\u0004ဌ\u0007", new Object[]{"a", "b", eaxh.a, "c", eaxg.a});
            }
            if (i2 == 3) {
                return new eawn();
            }
            if (i2 == 4) {
                return new eawm();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eawn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (eawn.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
