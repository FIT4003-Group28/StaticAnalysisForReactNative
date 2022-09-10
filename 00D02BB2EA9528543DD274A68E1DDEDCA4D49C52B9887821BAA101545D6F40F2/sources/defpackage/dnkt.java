package defpackage;
/* compiled from: PG */
/* renamed from: dnkt  reason: default package */
/* loaded from: classes6.dex */
public final class dnkt extends dsqw<dnkt, dnko> implements dssk {
    public static final dnkt c;
    private static volatile dssr<dnkt> d;
    public int a;
    public dnks b;

    static {
        dnkt dnktVar = new dnkt();
        c = dnktVar;
        dsqw.cc(dnkt.class, dnktVar);
    }

    private dnkt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnkt();
            }
            if (i2 == 4) {
                return new dnko();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnkt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnkt.class) {
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
