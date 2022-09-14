package defpackage;
/* compiled from: PG */
/* renamed from: djbh  reason: default package */
/* loaded from: classes6.dex */
public final class djbh extends dsqw<djbh, djbg> implements dssk {
    public static final djbh e;
    private static volatile dssr<djbh> g;
    public int a = 0;
    public Object b;
    public dhkr c;
    public ddde d;
    private int f;

    static {
        djbh djbhVar = new djbh();
        e = djbhVar;
        dsqw.cc(djbh.class, djbhVar);
    }

    private djbh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ဉ\u0002\u0005ဉ\u0003", new Object[]{"b", "a", "f", djsf.class, djsh.class, "c", "d"});
            }
            if (i2 == 3) {
                return new djbh();
            }
            if (i2 == 4) {
                return new djbg();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djbh> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djbh.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
