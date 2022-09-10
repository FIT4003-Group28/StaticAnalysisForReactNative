package defpackage;
/* compiled from: PG */
/* renamed from: dmzr  reason: default package */
/* loaded from: classes6.dex */
public final class dmzr extends dsqw<dmzr, dmzq> implements dssk {
    public static final dmzr b;
    private static volatile dssr<dmzr> d;
    public String a = "";
    private int c;

    static {
        dmzr dmzrVar = new dmzr();
        b = dmzrVar;
        dsqw.cc(dmzr.class, dmzrVar);
    }

    private dmzr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dmzr();
            }
            if (i2 == 4) {
                return new dmzq();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmzr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmzr.class) {
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
