package defpackage;
/* compiled from: PG */
/* renamed from: dkdr  reason: default package */
/* loaded from: classes6.dex */
public final class dkdr extends dsqw<dkdr, dkdq> implements dssk {
    public static final dkdr c;
    private static volatile dssr<dkdr> d;
    public int a;
    public int b;

    static {
        dkdr dkdrVar = new dkdr();
        c = dkdrVar;
        dsqw.cc(dkdr.class, dkdrVar);
    }

    private dkdr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dkdt.c()});
            }
            if (i2 == 3) {
                return new dkdr();
            }
            if (i2 == 4) {
                return new dkdq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkdr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkdr.class) {
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
