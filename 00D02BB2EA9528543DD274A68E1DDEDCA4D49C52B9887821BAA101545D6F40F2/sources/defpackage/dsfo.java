package defpackage;
/* compiled from: PG */
/* renamed from: dsfo  reason: default package */
/* loaded from: classes6.dex */
public final class dsfo extends dsqw<dsfo, dsfn> implements dssk {
    public static final dsfo d;
    private static volatile dssr<dsfo> f;
    public dsfc a;
    public dsfc b;
    public dsfk c;
    private int e;

    static {
        dsfo dsfoVar = new dsfo();
        d = dsfoVar;
        dsqw.cc(dsfo.class, dsfoVar);
    }

    private dsfo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dsfo();
            }
            if (i2 == 4) {
                return new dsfn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsfo> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dsfo.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
