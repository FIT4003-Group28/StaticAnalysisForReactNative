package defpackage;
/* compiled from: PG */
/* renamed from: eayz  reason: default package */
/* loaded from: classes6.dex */
public final class eayz extends dsqw<eayz, eayy> implements dssk {
    public static final eayz d;
    private static volatile dssr<eayz> e;
    public int a;
    public int b;
    public long c = 1;

    static {
        eayz eayzVar = new eayz();
        d = eayzVar;
        dsqw.cc(eayz.class, eayzVar);
    }

    private eayz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", eaza.a, "c"});
            }
            if (i2 == 3) {
                return new eayz();
            }
            if (i2 == 4) {
                return new eayy();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eayz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (eayz.class) {
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
