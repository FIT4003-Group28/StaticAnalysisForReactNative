package defpackage;
/* compiled from: PG */
/* renamed from: dbnb  reason: default package */
/* loaded from: classes5.dex */
public final class dbnb extends dsqw<dbnb, dbmy> implements dssk {
    public static final dbnb b;
    private static volatile dssr<dbnb> d;
    public int a;
    private int c;

    static {
        dbnb dbnbVar = new dbnb();
        b = dbnbVar;
        dsqw.cc(dbnb.class, dbnbVar);
    }

    private dbnb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dbmz.a});
            }
            if (i2 == 3) {
                return new dbnb();
            }
            if (i2 == 4) {
                return new dbmy();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbnb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dbnb.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
