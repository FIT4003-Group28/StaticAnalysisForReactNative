package defpackage;
/* compiled from: PG */
/* renamed from: dtoz  reason: default package */
/* loaded from: classes6.dex */
public final class dtoz extends dsqw<dtoz, dtoy> implements dssk {
    public static final dtoz b;
    private static volatile dssr<dtoz> d;
    public String a = "";
    private int c;

    static {
        dtoz dtozVar = new dtoz();
        b = dtozVar;
        dsqw.cc(dtoz.class, dtozVar);
    }

    private dtoz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dtoz();
            }
            if (i2 == 4) {
                return new dtoy();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtoz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtoz.class) {
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
