package defpackage;
/* compiled from: PG */
/* renamed from: drdm  reason: default package */
/* loaded from: classes6.dex */
public final class drdm extends dsqw<drdm, drdl> implements dssk {
    public static final drdm e;
    private static volatile dssr<drdm> f;
    public int a;
    public drdk b;
    public boolean c;
    public dqiq d;

    static {
        drdm drdmVar = new drdm();
        e = drdmVar;
        dsqw.cc(drdm.class, drdmVar);
    }

    private drdm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0005ဇ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new drdm();
            }
            if (i2 == 4) {
                return new drdl();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drdm> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drdm.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
