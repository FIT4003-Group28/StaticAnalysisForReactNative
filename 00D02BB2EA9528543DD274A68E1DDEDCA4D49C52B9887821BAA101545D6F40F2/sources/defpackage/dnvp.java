package defpackage;
/* compiled from: PG */
/* renamed from: dnvp  reason: default package */
/* loaded from: classes6.dex */
public final class dnvp extends dsqw<dnvp, dnvo> implements dssk {
    public static final dnvp c;
    private static volatile dssr<dnvp> e;
    public boolean a;
    public boolean b;
    private int d;

    static {
        dnvp dnvpVar = new dnvp();
        c = dnvpVar;
        dsqw.cc(dnvp.class, dnvpVar);
    }

    private dnvp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dnvp();
            }
            if (i2 == 4) {
                return new dnvo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnvp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnvp.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
