package defpackage;
/* compiled from: PG */
/* renamed from: drdf  reason: default package */
/* loaded from: classes6.dex */
public final class drdf extends dsqw<drdf, drde> implements dssk {
    public static final drdf b;
    private static volatile dssr<drdf> d;
    public String a = "";
    private int c;

    static {
        drdf drdfVar = new drdf();
        b = drdfVar;
        dsqw.cc(drdf.class, drdfVar);
    }

    private drdf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new drdf();
            }
            if (i2 == 4) {
                return new drde();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drdf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drdf.class) {
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
