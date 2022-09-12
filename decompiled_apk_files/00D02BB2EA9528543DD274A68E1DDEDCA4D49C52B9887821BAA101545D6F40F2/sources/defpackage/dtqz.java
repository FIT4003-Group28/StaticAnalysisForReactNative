package defpackage;
/* compiled from: PG */
/* renamed from: dtqz  reason: default package */
/* loaded from: classes6.dex */
public final class dtqz extends dsqw<dtqz, dtqy> implements dssk {
    public static final dtqz b;
    private static volatile dssr<dtqz> d;
    public String a = "";
    private int c;

    static {
        dtqz dtqzVar = new dtqz();
        b = dtqzVar;
        dsqw.cc(dtqz.class, dtqzVar);
    }

    private dtqz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dtqz();
            }
            if (i2 == 4) {
                return new dtqy();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtqz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtqz.class) {
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
