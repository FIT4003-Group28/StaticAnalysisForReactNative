package defpackage;
/* compiled from: PG */
/* renamed from: dmsh  reason: default package */
/* loaded from: classes.dex */
public final class dmsh extends dsqw<dmsh, dmsg> implements dssk {
    public static final dmsh a;
    private static volatile dssr<dmsh> b;

    static {
        dmsh dmshVar = new dmsh();
        a = dmshVar;
        dsqw.cc(dmsh.class, dmshVar);
    }

    private dmsh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dmsh();
            }
            if (i2 == 4) {
                return new dmsg();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmsh> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dmsh.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
