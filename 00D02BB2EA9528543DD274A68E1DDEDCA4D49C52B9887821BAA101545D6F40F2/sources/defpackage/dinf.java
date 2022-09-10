package defpackage;
/* compiled from: PG */
/* renamed from: dinf  reason: default package */
/* loaded from: classes6.dex */
public final class dinf extends dsqw<dinf, dind> implements dssk {
    public static final dinf c;
    private static volatile dssr<dinf> d;
    public int a;
    public int b;

    static {
        dinf dinfVar = new dinf();
        c = dinfVar;
        dsqw.cc(dinf.class, dinfVar);
    }

    private dinf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dine.a});
            }
            if (i2 == 3) {
                return new dinf();
            }
            if (i2 == 4) {
                return new dind();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dinf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dinf.class) {
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
