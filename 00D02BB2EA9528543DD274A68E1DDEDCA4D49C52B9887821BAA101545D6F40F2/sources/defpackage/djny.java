package defpackage;
/* compiled from: PG */
/* renamed from: djny  reason: default package */
/* loaded from: classes6.dex */
public final class djny extends dsqw<djny, djns> implements dssk {
    public static final djny c;
    private static volatile dssr<djny> d;
    public int a = 0;
    public Object b;

    static {
        djny djnyVar = new djny();
        c = djnyVar;
        dsqw.cc(djny.class, djnyVar);
    }

    private djny() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဿ\u0000\u0002ဿ\u0000", new Object[]{"b", "a", djnx.c(), djnu.c()});
            }
            if (i2 == 3) {
                return new djny();
            }
            if (i2 == 4) {
                return new djns();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djny> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djny.class) {
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
