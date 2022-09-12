package defpackage;
/* compiled from: PG */
/* renamed from: dfze  reason: default package */
/* loaded from: classes6.dex */
public final class dfze extends dsqw<dfze, dfzd> implements dssk {
    public static final dfze d;
    private static volatile dssr<dfze> f;
    public String a = "";
    public String b = "";
    public dfzc c;
    private int e;

    static {
        dfze dfzeVar = new dfze();
        d = dfzeVar;
        dsqw.cc(dfze.class, dfzeVar);
    }

    private dfze() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0006ဉ\u0005", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dfze();
            }
            if (i2 == 4) {
                return new dfzd();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfze> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dfze.class) {
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
