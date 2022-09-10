package defpackage;
/* compiled from: PG */
/* renamed from: djlp  reason: default package */
/* loaded from: classes6.dex */
public final class djlp extends dsqw<djlp, djlo> implements dssk {
    public static final djlp c;
    private static volatile dssr<djlp> d;
    public int a;
    public int b;

    static {
        djlp djlpVar = new djlp();
        c = djlpVar;
        dsqw.cc(djlp.class, djlpVar);
    }

    private djlp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new djlp();
            }
            if (i2 == 4) {
                return new djlo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djlp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djlp.class) {
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
