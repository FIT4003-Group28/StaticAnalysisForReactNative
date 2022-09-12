package defpackage;
/* compiled from: PG */
/* renamed from: dmzj  reason: default package */
/* loaded from: classes6.dex */
public final class dmzj extends dsqw<dmzj, dmzi> implements dssk {
    public static final dmzj a;
    private static volatile dssr<dmzj> b;

    static {
        dmzj dmzjVar = new dmzj();
        a = dmzjVar;
        dsqw.cc(dmzj.class, dmzjVar);
    }

    private dmzj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dmzj();
            }
            if (i2 == 4) {
                return new dmzi();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmzj> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dmzj.class) {
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
