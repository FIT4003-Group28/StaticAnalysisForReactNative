package defpackage;
/* compiled from: PG */
/* renamed from: djrk  reason: default package */
/* loaded from: classes.dex */
public final class djrk extends dsqw<djrk, djrj> implements dssk {
    public static final djrk b;
    private static volatile dssr<djrk> d;
    public String a = "";
    private int c;

    static {
        djrk djrkVar = new djrk();
        b = djrkVar;
        dsqw.cc(djrk.class, djrkVar);
    }

    private djrk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new djrk();
            }
            if (i2 == 4) {
                return new djrj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djrk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djrk.class) {
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
