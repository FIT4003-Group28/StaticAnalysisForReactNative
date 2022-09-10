package defpackage;
/* compiled from: PG */
/* renamed from: asbv  reason: default package */
/* loaded from: classes2.dex */
public final class asbv extends dsqw<asbv, asbu> implements dssk {
    public static final asbv b;
    private static volatile dssr<asbv> c;
    public dsri a = dsrx.b;

    static {
        asbv asbvVar = new asbv();
        b = asbvVar;
        dsqw.cc(asbv.class, asbvVar);
    }

    private asbv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0014", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new asbv();
            }
            if (i2 == 4) {
                return new asbu();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<asbv> dssrVar = c;
            if (dssrVar == null) {
                synchronized (asbv.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
