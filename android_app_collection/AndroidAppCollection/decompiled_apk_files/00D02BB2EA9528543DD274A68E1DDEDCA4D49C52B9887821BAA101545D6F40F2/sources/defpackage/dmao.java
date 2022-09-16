package defpackage;
/* compiled from: PG */
/* renamed from: dmao  reason: default package */
/* loaded from: classes6.dex */
public final class dmao extends dsqw<dmao, dman> implements dssk {
    public static final dmao b;
    private static volatile dssr<dmao> c;
    public dsrj<dmam> a = dssu.b;

    static {
        dmao dmaoVar = new dmao();
        b = dmaoVar;
        dsqw.cc(dmao.class, dmaoVar);
    }

    private dmao() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", dmam.class});
            }
            if (i2 == 3) {
                return new dmao();
            }
            if (i2 == 4) {
                return new dman();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmao> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dmao.class) {
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
