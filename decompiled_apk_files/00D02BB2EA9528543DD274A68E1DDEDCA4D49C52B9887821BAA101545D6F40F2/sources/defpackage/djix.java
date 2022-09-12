package defpackage;
/* compiled from: PG */
/* renamed from: djix  reason: default package */
/* loaded from: classes6.dex */
public final class djix extends dsqw<djix, djiw> implements dssk {
    public static final djix b;
    private static volatile dssr<djix> d;
    public String a = "";
    private int c;

    static {
        djix djixVar = new djix();
        b = djixVar;
        dsqw.cc(djix.class, djixVar);
    }

    private djix() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new djix();
            }
            if (i2 == 4) {
                return new djiw();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djix> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djix.class) {
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
