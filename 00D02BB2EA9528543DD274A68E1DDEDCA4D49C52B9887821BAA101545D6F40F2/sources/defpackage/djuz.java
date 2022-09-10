package defpackage;
/* compiled from: PG */
/* renamed from: djuz  reason: default package */
/* loaded from: classes6.dex */
public final class djuz extends dsqw<djuz, djuy> implements dssk {
    public static final djuz a;
    private static volatile dssr<djuz> b;

    static {
        djuz djuzVar = new djuz();
        a = djuzVar;
        dsqw.cc(djuz.class, djuzVar);
    }

    private djuz() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djuz();
            }
            if (i2 == 4) {
                return new djuy();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djuz> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djuz.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
