package defpackage;
/* compiled from: PG */
/* renamed from: djgo  reason: default package */
/* loaded from: classes6.dex */
public final class djgo extends dsqw<djgo, djgm> implements dssk {
    public static final djgo c;
    private static volatile dssr<djgo> d;
    public int a;
    public int b;

    static {
        djgo djgoVar = new djgo();
        c = djgoVar;
        dsqw.cc(djgo.class, djgoVar);
    }

    private djgo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", djgn.a});
            }
            if (i2 == 3) {
                return new djgo();
            }
            if (i2 == 4) {
                return new djgm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djgo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djgo.class) {
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