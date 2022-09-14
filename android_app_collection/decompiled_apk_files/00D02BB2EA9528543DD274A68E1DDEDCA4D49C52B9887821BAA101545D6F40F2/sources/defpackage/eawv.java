package defpackage;
/* compiled from: PG */
/* renamed from: eawv  reason: default package */
/* loaded from: classes6.dex */
public final class eawv extends dsqw<eawv, eawu> implements dssk {
    public static final eawv d;
    private static volatile dssr<eawv> e;
    public int a;
    public int b;
    public long c;

    static {
        eawv eawvVar = new eawv();
        d = eawvVar;
        dsqw.cc(eawv.class, eawvVar);
    }

    private eawv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဂ\u0002", new Object[]{"a", "b", eaxk.a, "c"});
            }
            if (i2 == 3) {
                return new eawv();
            }
            if (i2 == 4) {
                return new eawu();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eawv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (eawv.class) {
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
