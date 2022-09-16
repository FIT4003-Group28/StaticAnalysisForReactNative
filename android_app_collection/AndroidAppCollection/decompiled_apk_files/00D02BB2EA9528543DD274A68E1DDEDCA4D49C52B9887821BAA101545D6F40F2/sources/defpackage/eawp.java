package defpackage;
/* compiled from: PG */
/* renamed from: eawp  reason: default package */
/* loaded from: classes6.dex */
public final class eawp extends dsqw<eawp, eawo> implements dssk {
    public static final eawp d;
    private static volatile dssr<eawp> e;
    public int a;
    public int b;
    public long c;

    static {
        eawp eawpVar = new eawp();
        d = eawpVar;
        dsqw.cc(eawp.class, eawpVar);
    }

    private eawp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဂ\u0001\u0003ဌ\u0000", new Object[]{"a", "c", "b", eaxi.a});
            }
            if (i2 == 3) {
                return new eawp();
            }
            if (i2 == 4) {
                return new eawo();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eawp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (eawp.class) {
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
