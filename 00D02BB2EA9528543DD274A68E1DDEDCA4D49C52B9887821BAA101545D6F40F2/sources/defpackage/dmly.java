package defpackage;
/* compiled from: PG */
/* renamed from: dmly  reason: default package */
/* loaded from: classes.dex */
public final class dmly extends dsqw<dmly, dmlx> implements dssk {
    public static final dmly b;
    private static volatile dssr<dmly> c;
    public dsrj<dmms> a = dssu.b;

    static {
        dmly dmlyVar = new dmly();
        b = dmlyVar;
        dsqw.cc(dmly.class, dmlyVar);
    }

    private dmly() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dmms.class});
            }
            if (i2 == 3) {
                return new dmly();
            }
            if (i2 == 4) {
                return new dmlx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmly> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dmly.class) {
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
