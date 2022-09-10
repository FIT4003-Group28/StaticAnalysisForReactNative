package defpackage;
/* compiled from: PG */
/* renamed from: djgh  reason: default package */
/* loaded from: classes6.dex */
public final class djgh extends dsqw<djgh, djge> implements dssk {
    public static final djgh b;
    private static volatile dssr<djgh> d;
    public int a = 0;
    private Object c;

    static {
        djgh djghVar = new djgh();
        b = djghVar;
        dsqw.cc(djgh.class, djghVar);
    }

    private djgh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0001\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006ြ\u0000", new Object[]{"c", "a", djgg.class});
            }
            if (i2 == 3) {
                return new djgh();
            }
            if (i2 == 4) {
                return new djge();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djgh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djgh.class) {
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
