package defpackage;
/* compiled from: PG */
/* renamed from: dkfl  reason: default package */
/* loaded from: classes6.dex */
public final class dkfl extends dsqw<dkfl, dkfk> implements dssk {
    public static final dkfl d;
    private static volatile dssr<dkfl> f;
    public String a = "";
    public String b = "";
    public String c = "";
    private int e;

    static {
        dkfl dkflVar = new dkfl();
        d = dkflVar;
        dsqw.cc(dkfl.class, dkflVar);
    }

    private dkfl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dkfl();
            }
            if (i2 == 4) {
                return new dkfk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkfl> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkfl.class) {
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
