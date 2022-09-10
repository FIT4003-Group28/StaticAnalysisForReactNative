package defpackage;
/* compiled from: PG */
/* renamed from: dpxz  reason: default package */
/* loaded from: classes6.dex */
public final class dpxz extends dsqw<dpxz, dpxy> implements dssk {
    public static final dpxz b;
    private static volatile dssr<dpxz> d;
    public String a = "";
    private int c;

    static {
        dpxz dpxzVar = new dpxz();
        b = dpxzVar;
        dsqw.cc(dpxz.class, dpxzVar);
    }

    private dpxz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dpxz();
            }
            if (i2 == 4) {
                return new dpxy();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpxz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpxz.class) {
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
