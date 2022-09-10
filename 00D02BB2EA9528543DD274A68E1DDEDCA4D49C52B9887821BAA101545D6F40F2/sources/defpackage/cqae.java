package defpackage;
/* compiled from: PG */
/* renamed from: cqae  reason: default package */
/* loaded from: classes5.dex */
public final class cqae extends dsqw<cqae, cqad> implements dssk {
    public static final cqae c;
    private static volatile dssr<cqae> d;
    public int a;
    public int b;

    static {
        cqae cqaeVar = new cqae();
        c = cqaeVar;
        dsqw.cc(cqae.class, cqaeVar);
    }

    private cqae() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", cpxw.a});
            }
            if (i2 == 3) {
                return new cqae();
            }
            if (i2 == 4) {
                return new cqad();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cqae> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cqae.class) {
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
