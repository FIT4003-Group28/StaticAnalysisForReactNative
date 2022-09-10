package defpackage;
/* compiled from: PG */
/* renamed from: csfh  reason: default package */
/* loaded from: classes5.dex */
public final class csfh extends dsqw<csfh, cses> implements dssk {
    public static final csfh c;
    private static volatile dssr<csfh> d;
    public int a = 0;
    public Object b;

    static {
        csfh csfhVar = new csfh();
        c = csfhVar;
        dsqw.cc(csfh.class, csfhVar);
    }

    private csfh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000", new Object[]{"b", "a", csew.class, csfg.class, csfe.class, cseu.class, csfc.class, csfa.class, csey.class});
            }
            if (i2 == 3) {
                return new csfh();
            }
            if (i2 == 4) {
                return new cses();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<csfh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (csfh.class) {
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
