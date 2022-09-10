package defpackage;
/* compiled from: PG */
/* renamed from: dsws  reason: default package */
/* loaded from: classes6.dex */
public final class dsws extends dsqw<dsws, dswr> implements dssk {
    public static final dsws e;
    private static volatile dssr<dsws> f;
    public int a;
    public long b;
    public int c;
    public int d;

    static {
        dsws dswsVar = new dsws();
        e = dswsVar;
        dsqw.cc(dsws.class, dswsVar);
    }

    private dsws() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဆ\u0001\u0003ဆ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dsws();
            }
            if (i2 == 4) {
                return new dswr();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsws> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dsws.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
