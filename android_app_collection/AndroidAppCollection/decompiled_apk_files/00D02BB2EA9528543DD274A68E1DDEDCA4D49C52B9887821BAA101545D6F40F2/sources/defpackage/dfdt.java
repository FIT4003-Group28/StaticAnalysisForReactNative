package defpackage;
/* compiled from: PG */
/* renamed from: dfdt  reason: default package */
/* loaded from: classes6.dex */
public final class dfdt extends dsqw<dfdt, dfds> implements dssk {
    public static final dfdt d;
    private static volatile dssr<dfdt> e;
    public int a;
    public int b;
    public String c = "";

    static {
        dfdt dfdtVar = new dfdt();
        d = dfdtVar;
        dsqw.cc(dfdt.class, dfdtVar);
    }

    private dfdt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dfdt();
            }
            if (i2 == 4) {
                return new dfds();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfdt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfdt.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
