package defpackage;
/* compiled from: PG */
/* renamed from: dvaa  reason: default package */
/* loaded from: classes6.dex */
public final class dvaa extends dsqw<dvaa, duzz> implements dssk {
    public static final dvaa c;
    private static volatile dssr<dvaa> e;
    public dpum a;
    public dpop b;
    private int d;

    static {
        dvaa dvaaVar = new dvaa();
        c = dvaaVar;
        dsqw.cc(dvaa.class, dvaaVar);
    }

    private dvaa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dvaa();
            }
            if (i2 == 4) {
                return new duzz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvaa> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvaa.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
