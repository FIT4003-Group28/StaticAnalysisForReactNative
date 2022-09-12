package defpackage;
/* compiled from: PG */
/* renamed from: drbg  reason: default package */
/* loaded from: classes6.dex */
public final class drbg extends dsqw<drbg, drbf> implements dssk {
    public static final drbg d;
    private static volatile dssr<drbg> f;
    public String a = "";
    public String b = "";
    public String c = "";
    private int e;

    static {
        drbg drbgVar = new drbg();
        d = drbgVar;
        dsqw.cc(drbg.class, drbgVar);
    }

    private drbg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new drbg();
            }
            if (i2 == 4) {
                return new drbf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drbg> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drbg.class) {
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
