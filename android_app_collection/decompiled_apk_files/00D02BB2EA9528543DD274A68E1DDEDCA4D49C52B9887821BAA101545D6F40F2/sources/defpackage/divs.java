package defpackage;
/* compiled from: PG */
/* renamed from: divs  reason: default package */
/* loaded from: classes6.dex */
public final class divs extends dsqw<divs, divr> implements dssk {
    public static final divs b;
    private static volatile dssr<divs> d;
    public String a = "";
    private int c;

    static {
        divs divsVar = new divs();
        b = divsVar;
        dsqw.cc(divs.class, divsVar);
    }

    private divs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new divs();
            }
            if (i2 == 4) {
                return new divr();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<divs> dssrVar = d;
            if (dssrVar == null) {
                synchronized (divs.class) {
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
