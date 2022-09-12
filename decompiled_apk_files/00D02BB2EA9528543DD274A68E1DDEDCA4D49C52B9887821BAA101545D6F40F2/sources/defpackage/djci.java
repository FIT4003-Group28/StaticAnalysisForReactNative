package defpackage;
/* compiled from: PG */
/* renamed from: djci  reason: default package */
/* loaded from: classes6.dex */
public final class djci extends dsqw<djci, djch> implements dssk {
    public static final djci b;
    private static volatile dssr<djci> d;
    public String a = "";
    private int c;

    static {
        djci djciVar = new djci();
        b = djciVar;
        dsqw.cc(djci.class, djciVar);
    }

    private djci() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new djci();
            }
            if (i2 == 4) {
                return new djch();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djci> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djci.class) {
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
