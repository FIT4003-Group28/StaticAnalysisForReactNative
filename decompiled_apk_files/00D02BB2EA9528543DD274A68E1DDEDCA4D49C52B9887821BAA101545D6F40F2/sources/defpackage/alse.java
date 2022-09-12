package defpackage;
/* compiled from: PG */
/* renamed from: alse  reason: default package */
/* loaded from: classes2.dex */
public final class alse extends dsqw<alse, alsd> implements dssk {
    public static final alse c;
    private static volatile dssr<alse> e;
    public dspd a = dspd.b;
    public String b = "";
    private int d;

    static {
        alse alseVar = new alse();
        c = alseVar;
        dsqw.cc(alse.class, alseVar);
    }

    private alse() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new alse();
            }
            if (i2 == 4) {
                return new alsd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<alse> dssrVar = e;
            if (dssrVar == null) {
                synchronized (alse.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
