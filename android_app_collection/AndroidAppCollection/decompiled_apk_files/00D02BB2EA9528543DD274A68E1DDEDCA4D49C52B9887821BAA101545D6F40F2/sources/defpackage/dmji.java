package defpackage;
/* compiled from: PG */
/* renamed from: dmji  reason: default package */
/* loaded from: classes.dex */
public final class dmji extends dsqw<dmji, dmjh> implements dssk {
    public static final dmji a;
    private static volatile dssr<dmji> b;

    static {
        dmji dmjiVar = new dmji();
        a = dmjiVar;
        dsqw.cc(dmji.class, dmjiVar);
    }

    private dmji() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dmji();
            }
            if (i2 == 4) {
                return new dmjh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmji> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dmji.class) {
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
