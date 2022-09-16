package defpackage;
/* compiled from: PG */
/* renamed from: djmf  reason: default package */
/* loaded from: classes6.dex */
public final class djmf extends dsqw<djmf, djlv> implements dssk {
    public static final djmf c;
    private static volatile dssr<djmf> d;
    public int a = 0;
    public Object b;

    static {
        djmf djmfVar = new djmf();
        c = djmfVar;
        dsqw.cc(djmf.class, djmfVar);
    }

    private djmf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဿ\u0000\u0004ြ\u0000", new Object[]{"b", "a", djme.c(), djmb.class});
            }
            if (i2 == 3) {
                return new djmf();
            }
            if (i2 == 4) {
                return new djlv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djmf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djmf.class) {
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
