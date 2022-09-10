package defpackage;
/* compiled from: PG */
/* renamed from: djza  reason: default package */
/* loaded from: classes6.dex */
public final class djza extends dsqw<djza, djyz> implements dssk {
    public static final djza e;
    private static volatile dssr<djza> g;
    public int a;
    public dopk b;
    public dvvo d;
    private byte f = 2;
    public int c = 2;

    static {
        djza djzaVar = new djza();
        e = djzaVar;
        dsqw.cc(djza.class, djzaVar);
    }

    private djza() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001\u0004ဉ\u0003", new Object[]{"a", "b", "c", doqc.a, "d"});
            }
            if (i2 == 3) {
                return new djza();
            }
            if (i2 == 4) {
                return new djyz();
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
            dssr<djza> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djza.class) {
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
