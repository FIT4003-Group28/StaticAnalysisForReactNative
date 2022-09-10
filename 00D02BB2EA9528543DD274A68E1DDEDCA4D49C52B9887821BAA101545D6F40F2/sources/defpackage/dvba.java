package defpackage;
/* compiled from: PG */
/* renamed from: dvba  reason: default package */
/* loaded from: classes6.dex */
public final class dvba extends dsqw<dvba, dvaz> implements dssk {
    public static final dvba e;
    private static volatile dssr<dvba> f;
    public int a;
    public String b = "";
    public String c = "";
    public boolean d;

    static {
        dvba dvbaVar = new dvba();
        e = dvbaVar;
        dsqw.cc(dvba.class, dvbaVar);
    }

    private dvba() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dvba();
            }
            if (i2 == 4) {
                return new dvaz();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvba> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvba.class) {
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
