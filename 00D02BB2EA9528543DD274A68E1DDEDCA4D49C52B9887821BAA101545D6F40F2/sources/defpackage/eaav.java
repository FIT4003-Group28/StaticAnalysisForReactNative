package defpackage;
/* compiled from: PG */
/* renamed from: eaav  reason: default package */
/* loaded from: classes.dex */
public final class eaav extends dsqw<eaav, eaau> implements dssk {
    public static final eaav c;
    private static volatile dssr<eaav> d;
    public int a;
    public eaat b;

    static {
        eaav eaavVar = new eaav();
        c = eaavVar;
        dsqw.cc(eaav.class, eaavVar);
    }

    private eaav() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new eaav();
            }
            if (i2 == 4) {
                return new eaau();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eaav> dssrVar = d;
            if (dssrVar == null) {
                synchronized (eaav.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
