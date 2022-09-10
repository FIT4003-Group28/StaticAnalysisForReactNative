package defpackage;
/* compiled from: PG */
/* renamed from: djwd  reason: default package */
/* loaded from: classes6.dex */
public final class djwd extends dsqw<djwd, djwc> implements dssk {
    public static final djwd a;
    private static volatile dssr<djwd> b;

    static {
        djwd djwdVar = new djwd();
        a = djwdVar;
        dsqw.cc(djwd.class, djwdVar);
    }

    private djwd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djwd();
            }
            if (i2 == 4) {
                return new djwc();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djwd> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djwd.class) {
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
