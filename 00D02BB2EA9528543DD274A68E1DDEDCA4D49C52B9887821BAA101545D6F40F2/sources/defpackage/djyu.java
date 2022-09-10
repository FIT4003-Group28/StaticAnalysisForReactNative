package defpackage;
/* compiled from: PG */
/* renamed from: djyu  reason: default package */
/* loaded from: classes6.dex */
public final class djyu extends dsqw<djyu, djyt> implements dssk {
    public static final djyu c;
    private static volatile dssr<djyu> d;
    public int a;
    public int b;

    static {
        djyu djyuVar = new djyu();
        c = djyuVar;
        dsqw.cc(djyu.class, djyuVar);
    }

    private djyu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new djyu();
            }
            if (i2 == 4) {
                return new djyt();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djyu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djyu.class) {
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
