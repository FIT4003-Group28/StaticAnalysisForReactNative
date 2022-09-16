package defpackage;
/* compiled from: PG */
/* renamed from: dowq  reason: default package */
/* loaded from: classes.dex */
public final class dowq extends dsqw<dowq, dowo> implements dssk {
    public static final dowq c;
    private static volatile dssr<dowq> d;
    public int a;
    public int b;

    static {
        dowq dowqVar = new dowq();
        c = dowqVar;
        dsqw.cc(dowq.class, dowqVar);
    }

    private dowq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dowp.a});
            }
            if (i2 == 3) {
                return new dowq();
            }
            if (i2 == 4) {
                return new dowo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dowq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dowq.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
