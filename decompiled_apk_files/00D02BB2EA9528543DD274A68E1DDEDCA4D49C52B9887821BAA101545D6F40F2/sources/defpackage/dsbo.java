package defpackage;
/* compiled from: PG */
/* renamed from: dsbo  reason: default package */
/* loaded from: classes6.dex */
public final class dsbo extends dsqw<dsbo, dsbm> implements dssk {
    public static final dsbo c;
    private static volatile dssr<dsbo> d;
    public int a = 0;
    public Object b;

    static {
        dsbo dsboVar = new dsbo();
        c = dsboVar;
        dsqw.cc(dsbo.class, dsboVar);
    }

    private dsbo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", dscv.class, dsdb.class, dseb.class});
            }
            if (i2 == 3) {
                return new dsbo();
            }
            if (i2 == 4) {
                return new dsbm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsbo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dsbo.class) {
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
