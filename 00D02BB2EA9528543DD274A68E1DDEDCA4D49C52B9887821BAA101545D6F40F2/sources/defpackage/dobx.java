package defpackage;
/* compiled from: PG */
/* renamed from: dobx  reason: default package */
/* loaded from: classes6.dex */
public final class dobx extends dsqw<dobx, dobw> implements dssk {
    public static final dobx d;
    private static volatile dssr<dobx> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        dobx dobxVar = new dobx();
        d = dobxVar;
        dsqw.cc(dobx.class, dobxVar);
    }

    private dobx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dobx();
            }
            if (i2 == 4) {
                return new dobw();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dobx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dobx.class) {
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
