package defpackage;
/* compiled from: PG */
/* renamed from: dixy  reason: default package */
/* loaded from: classes6.dex */
public final class dixy extends dsqw<dixy, dixx> implements dssk {
    public static final dsrg<Integer, dunt> b = new dixw();
    public static final dixy c;
    private static volatile dssr<dixy> d;
    public dsrf a = dsqz.b;

    static {
        dixy dixyVar = new dixy();
        c = dixyVar;
        dsqw.cc(dixy.class, dixyVar);
    }

    private dixy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", dunt.c()});
            }
            if (i2 == 3) {
                return new dixy();
            }
            if (i2 == 4) {
                return new dixx();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dixy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dixy.class) {
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
