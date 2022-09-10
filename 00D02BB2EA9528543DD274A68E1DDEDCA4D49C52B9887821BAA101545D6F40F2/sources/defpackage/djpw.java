package defpackage;
/* compiled from: PG */
/* renamed from: djpw  reason: default package */
/* loaded from: classes6.dex */
public final class djpw extends dsqw<djpw, djpv> implements dssk {
    public static final djpw f;
    private static volatile dssr<djpw> g;
    public int a;
    public dumx b;
    public duje c;
    public dgxj d;
    public ddco e;

    static {
        djpw djpwVar = new djpw();
        f = djpwVar;
        dsqw.cc(djpw.class, djpwVar);
    }

    private djpw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0006ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new djpw();
            }
            if (i2 == 4) {
                return new djpv();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djpw> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djpw.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
