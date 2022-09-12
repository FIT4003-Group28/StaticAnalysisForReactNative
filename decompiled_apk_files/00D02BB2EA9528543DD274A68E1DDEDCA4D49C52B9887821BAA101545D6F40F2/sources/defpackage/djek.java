package defpackage;
/* compiled from: PG */
/* renamed from: djek  reason: default package */
/* loaded from: classes6.dex */
public final class djek extends dsqw<djek, djej> implements dssk {
    public static final djek b;
    private static volatile dssr<djek> d;
    public String a = "";
    private int c;

    static {
        djek djekVar = new djek();
        b = djekVar;
        dsqw.cc(djek.class, djekVar);
    }

    private djek() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new djek();
            }
            if (i2 == 4) {
                return new djej();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djek> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djek.class) {
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
