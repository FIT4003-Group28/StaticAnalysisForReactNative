package defpackage;
/* compiled from: PG */
/* renamed from: dzzi  reason: default package */
/* loaded from: classes.dex */
public final class dzzi extends dsqw<dzzi, dzzh> implements dssk {
    public static final dzzi c;
    private static volatile dssr<dzzi> d;
    public int a;
    public boolean b;

    static {
        dzzi dzziVar = new dzzi();
        c = dzziVar;
        dsqw.cc(dzzi.class, dzziVar);
    }

    private dzzi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dzzi();
            }
            if (i2 == 4) {
                return new dzzh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dzzi> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dzzi.class) {
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
