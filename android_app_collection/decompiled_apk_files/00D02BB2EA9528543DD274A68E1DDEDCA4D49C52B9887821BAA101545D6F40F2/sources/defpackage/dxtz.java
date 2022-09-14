package defpackage;
/* compiled from: PG */
/* renamed from: dxtz  reason: default package */
/* loaded from: classes6.dex */
public final class dxtz extends dsqw<dxtz, dxty> implements dssk {
    public static final dxtz b;
    private static volatile dssr<dxtz> c;
    public dxwi a;

    static {
        dxtz dxtzVar = new dxtz();
        b = dxtzVar;
        dsqw.cc(dxtz.class, dxtzVar);
    }

    private dxtz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxtz();
            }
            if (i2 == 4) {
                return new dxty();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxtz> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxtz.class) {
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
