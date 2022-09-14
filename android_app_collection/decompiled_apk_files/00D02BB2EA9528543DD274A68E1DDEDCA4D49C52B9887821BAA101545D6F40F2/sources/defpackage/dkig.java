package defpackage;
/* compiled from: PG */
/* renamed from: dkig  reason: default package */
/* loaded from: classes6.dex */
public final class dkig extends dsqw<dkig, dkif> implements dssk {
    public static final dkig b;
    private static volatile dssr<dkig> d;
    public boolean a = true;
    private int c;

    static {
        dkig dkigVar = new dkig();
        b = dkigVar;
        dsqw.cc(dkig.class, dkigVar);
    }

    private dkig() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dkig();
            }
            if (i2 == 4) {
                return new dkif();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkig> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkig.class) {
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
