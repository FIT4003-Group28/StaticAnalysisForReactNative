package defpackage;
/* compiled from: PG */
/* renamed from: donk  reason: default package */
/* loaded from: classes6.dex */
public final class donk extends dsqw<donk, donj> implements dssk {
    public static final donk b;
    private static volatile dssr<donk> d;
    public dong a;
    private int c;

    static {
        donk donkVar = new donk();
        b = donkVar;
        dsqw.cc(donk.class, donkVar);
    }

    private donk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new donk();
            }
            if (i2 == 4) {
                return new donj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<donk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (donk.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
