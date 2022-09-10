package defpackage;
/* compiled from: PG */
/* renamed from: djkn  reason: default package */
/* loaded from: classes6.dex */
public final class djkn extends dsqw<djkn, djkl> implements dssk {
    public static final djkn c;
    private static volatile dssr<djkn> d;
    public int a = 0;
    public Object b;

    static {
        djkn djknVar = new djkn();
        c = djknVar;
        dsqw.cc(djkn.class, djknVar);
    }

    private djkn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဿ\u0000\u0004ြ\u0000", new Object[]{"b", "a", djkm.a, djjx.class});
            }
            if (i2 == 3) {
                return new djkn();
            }
            if (i2 == 4) {
                return new djkl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djkn> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djkn.class) {
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
