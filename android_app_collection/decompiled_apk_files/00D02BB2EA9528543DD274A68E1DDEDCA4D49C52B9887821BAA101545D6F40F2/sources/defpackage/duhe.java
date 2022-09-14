package defpackage;
/* compiled from: PG */
/* renamed from: duhe  reason: default package */
/* loaded from: classes6.dex */
public final class duhe extends dsqw<duhe, duhd> implements dssk {
    public static final duhe c;
    private static volatile dssr<duhe> d;
    public double a;
    public double b;

    static {
        duhe duheVar = new duhe();
        c = duheVar;
        dsqw.cc(duhe.class, duheVar);
    }

    private duhe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new duhe();
            }
            if (i2 == 4) {
                return new duhd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duhe> dssrVar = d;
            if (dssrVar == null) {
                synchronized (duhe.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
