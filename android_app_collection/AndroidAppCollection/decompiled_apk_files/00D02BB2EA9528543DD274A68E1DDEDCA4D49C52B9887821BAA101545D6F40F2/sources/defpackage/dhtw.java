package defpackage;
/* compiled from: PG */
/* renamed from: dhtw  reason: default package */
/* loaded from: classes6.dex */
public final class dhtw extends dsqw<dhtw, dhtv> implements dssk {
    public static final dhtw a;
    private static volatile dssr<dhtw> b;

    static {
        dhtw dhtwVar = new dhtw();
        a = dhtwVar;
        dsqw.cc(dhtw.class, dhtwVar);
    }

    private dhtw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhtw();
            }
            if (i2 == 4) {
                return new dhtv();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhtw> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhtw.class) {
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
