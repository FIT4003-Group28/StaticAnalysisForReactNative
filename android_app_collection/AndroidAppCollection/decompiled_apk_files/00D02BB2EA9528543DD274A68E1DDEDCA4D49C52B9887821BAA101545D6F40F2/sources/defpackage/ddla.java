package defpackage;
/* compiled from: PG */
/* renamed from: ddla  reason: default package */
/* loaded from: classes5.dex */
public final class ddla extends dsqw<ddla, ddkz> implements dssk {
    public static final ddla e;
    private static volatile dssr<ddla> f;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";

    static {
        ddla ddlaVar = new ddla();
        e = ddlaVar;
        dsqw.cc(ddla.class, ddlaVar);
    }

    private ddla() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ddla();
            }
            if (i2 == 4) {
                return new ddkz();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddla> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddla.class) {
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
