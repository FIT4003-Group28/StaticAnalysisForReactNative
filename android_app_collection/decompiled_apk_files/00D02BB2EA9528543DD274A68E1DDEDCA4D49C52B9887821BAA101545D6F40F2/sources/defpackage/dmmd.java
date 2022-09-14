package defpackage;
/* compiled from: PG */
/* renamed from: dmmd  reason: default package */
/* loaded from: classes6.dex */
public final class dmmd extends dsqw<dmmd, dmmc> implements dssk {
    public static final dmmd b;
    private static volatile dssr<dmmd> c;
    public dsrj<dmma> a = dssu.b;

    static {
        dmmd dmmdVar = new dmmd();
        b = dmmdVar;
        dsqw.cc(dmmd.class, dmmdVar);
    }

    private dmmd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dmma.class});
            }
            if (i2 == 3) {
                return new dmmd();
            }
            if (i2 == 4) {
                return new dmmc();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmmd> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dmmd.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
