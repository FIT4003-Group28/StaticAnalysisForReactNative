package defpackage;
/* compiled from: PG */
/* renamed from: dpxu  reason: default package */
/* loaded from: classes6.dex */
public final class dpxu extends dsqw<dpxu, dpxr> implements dssk {
    public static final dpxu d;
    private static volatile dssr<dpxu> f;
    public String a = "";
    public int b;
    public int c;
    private int e;

    static {
        dpxu dpxuVar = new dpxu();
        d = dpxuVar;
        dsqw.cc(dpxu.class, dpxuVar);
    }

    private dpxu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"e", "a", "b", dpxp.a, "c", dpxs.a});
            }
            if (i2 == 3) {
                return new dpxu();
            }
            if (i2 == 4) {
                return new dpxr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpxu> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpxu.class) {
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
