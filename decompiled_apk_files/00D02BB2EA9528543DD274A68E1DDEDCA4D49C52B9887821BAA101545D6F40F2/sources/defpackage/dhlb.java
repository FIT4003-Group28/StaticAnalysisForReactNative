package defpackage;
/* compiled from: PG */
/* renamed from: dhlb  reason: default package */
/* loaded from: classes6.dex */
public final class dhlb extends dsqw<dhlb, dhky> implements dssk {
    public static final dhlb e;
    private static volatile dssr<dhlb> f;
    public int a;
    public int b = 1;
    public int c = 1;
    public int d = 50;

    static {
        dhlb dhlbVar = new dhlb();
        e = dhlbVar;
        dsqw.cc(dhlb.class, dhlbVar);
    }

    private dhlb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"a", "b", dhkz.a, "c", dhkz.a, "d"});
            }
            if (i2 == 3) {
                return new dhlb();
            }
            if (i2 == 4) {
                return new dhky();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhlb> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dhlb.class) {
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
