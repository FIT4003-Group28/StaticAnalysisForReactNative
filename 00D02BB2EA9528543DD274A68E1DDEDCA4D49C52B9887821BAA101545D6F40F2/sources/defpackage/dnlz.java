package defpackage;
/* compiled from: PG */
/* renamed from: dnlz  reason: default package */
/* loaded from: classes6.dex */
public final class dnlz extends dsqw<dnlz, dnly> implements dssk {
    public static final dnlz d;
    private static volatile dssr<dnlz> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        dnlz dnlzVar = new dnlz();
        d = dnlzVar;
        dsqw.cc(dnlz.class, dnlzVar);
    }

    private dnlz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dnlz();
            }
            if (i2 == 4) {
                return new dnly();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnlz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnlz.class) {
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
