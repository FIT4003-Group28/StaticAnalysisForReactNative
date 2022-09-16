package defpackage;
/* compiled from: PG */
/* renamed from: dove  reason: default package */
/* loaded from: classes6.dex */
public final class dove extends dsqw<dove, dovd> implements dssk {
    public static final dove c;
    private static volatile dssr<dove> d;
    public int a;
    public int b;

    static {
        dove doveVar = new dove();
        c = doveVar;
        dsqw.cc(dove.class, doveVar);
    }

    private dove() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dqvj.d()});
            }
            if (i2 == 3) {
                return new dove();
            }
            if (i2 == 4) {
                return new dovd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dove> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dove.class) {
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
