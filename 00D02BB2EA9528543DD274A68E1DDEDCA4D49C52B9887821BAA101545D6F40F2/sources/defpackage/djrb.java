package defpackage;
/* compiled from: PG */
/* renamed from: djrb  reason: default package */
/* loaded from: classes6.dex */
public final class djrb extends dsqw<djrb, djra> implements dssk {
    public static final djrb c;
    private static volatile dssr<djrb> d;
    public int a = 0;
    public Object b;

    static {
        djrb djrbVar = new djrb();
        c = djrbVar;
        dsqw.cc(djrb.class, djrbVar);
    }

    private djrb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000", new Object[]{"b", "a"});
            }
            if (i2 == 3) {
                return new djrb();
            }
            if (i2 == 4) {
                return new djra();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djrb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djrb.class) {
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
