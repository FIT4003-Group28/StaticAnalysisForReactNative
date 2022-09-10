package defpackage;
/* compiled from: PG */
/* renamed from: djgv  reason: default package */
/* loaded from: classes6.dex */
public final class djgv extends dsqw<djgv, djgt> implements dssk {
    public static final djgv c;
    private static volatile dssr<djgv> d;
    public int a;
    public int b;

    static {
        djgv djgvVar = new djgv();
        c = djgvVar;
        dsqw.cc(djgv.class, djgvVar);
    }

    private djgv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", djgu.a});
            }
            if (i2 == 3) {
                return new djgv();
            }
            if (i2 == 4) {
                return new djgt();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djgv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djgv.class) {
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
