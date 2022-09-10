package defpackage;
/* compiled from: PG */
/* renamed from: dndt  reason: default package */
/* loaded from: classes6.dex */
public final class dndt extends dsqw<dndt, dnds> implements dssk {
    public static final dndt d;
    private static volatile dssr<dndt> f;
    public drdg a;
    public String b = "";
    public String c = "";
    private int e;

    static {
        dndt dndtVar = new dndt();
        d = dndtVar;
        dsqw.cc(dndt.class, dndtVar);
    }

    private dndt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0004ဈ\u0003", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dndt();
            }
            if (i2 == 4) {
                return new dnds();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dndt> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dndt.class) {
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
