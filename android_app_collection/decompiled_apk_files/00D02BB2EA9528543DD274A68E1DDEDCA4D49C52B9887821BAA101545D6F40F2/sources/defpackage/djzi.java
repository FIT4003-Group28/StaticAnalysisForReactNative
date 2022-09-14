package defpackage;
/* compiled from: PG */
/* renamed from: djzi  reason: default package */
/* loaded from: classes.dex */
public final class djzi extends dsqw<djzi, djzh> implements dssk {
    public static final djzi b;
    private static volatile dssr<djzi> c;
    public dsrf a = dsqz.b;

    static {
        djzi djziVar = new djzi();
        b = djziVar;
        dsqw.cc(djzi.class, djziVar);
    }

    private djzi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new djzi();
            }
            if (i2 == 4) {
                return new djzh();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djzi> dssrVar = c;
            if (dssrVar == null) {
                synchronized (djzi.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
