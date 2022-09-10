package defpackage;
/* compiled from: PG */
/* renamed from: djcw  reason: default package */
/* loaded from: classes6.dex */
public final class djcw extends dsqw<djcw, djcv> implements dssk {
    public static final djcw e;
    private static volatile dssr<djcw> g;
    public int a;
    public dvyw b;
    public dpuq c;
    public int d;
    private byte f = 2;

    static {
        djcw djcwVar = new djcw();
        e = djcwVar;
        dsqw.cc(djcw.class, djcwVar);
    }

    private djcw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0004င\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new djcw();
            }
            if (i2 == 4) {
                return new djcv();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<djcw> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djcw.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
