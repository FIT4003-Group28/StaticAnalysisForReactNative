package defpackage;
/* compiled from: PG */
/* renamed from: dqae  reason: default package */
/* loaded from: classes6.dex */
public final class dqae extends dsqw<dqae, dqad> implements dssk {
    public static final dqae c;
    private static volatile dssr<dqae> d;
    public int a;
    public dqau b;

    static {
        dqae dqaeVar = new dqae();
        c = dqaeVar;
        dsqw.cc(dqae.class, dqaeVar);
    }

    private dqae() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dqae();
            }
            if (i2 == 4) {
                return new dqad();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqae> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqae.class) {
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
