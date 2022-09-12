package defpackage;
/* compiled from: PG */
/* renamed from: djgb  reason: default package */
/* loaded from: classes6.dex */
public final class djgb extends dsqw<djgb, djga> implements dssk {
    public static final djgb b;
    private static volatile dssr<djgb> d;
    public String a = "";
    private int c;

    static {
        djgb djgbVar = new djgb();
        b = djgbVar;
        dsqw.cc(djgb.class, djgbVar);
    }

    private djgb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new djgb();
            }
            if (i2 == 4) {
                return new djga();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djgb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djgb.class) {
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
