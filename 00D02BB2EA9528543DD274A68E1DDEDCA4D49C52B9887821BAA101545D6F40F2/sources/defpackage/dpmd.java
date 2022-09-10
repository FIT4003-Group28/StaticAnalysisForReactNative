package defpackage;
/* compiled from: PG */
/* renamed from: dpmd  reason: default package */
/* loaded from: classes6.dex */
public final class dpmd extends dsqw<dpmd, dply> implements dssk {
    public static final dpmd d;
    private static volatile dssr<dpmd> f;
    public dpum a;
    public double b;
    public dsrj<dpmc> c;
    private int e;

    static {
        dpmd dpmdVar = new dpmd();
        d = dpmdVar;
        dsqw.cc(dpmd.class, dpmdVar);
    }

    private dpmd() {
        dssu<Object> dssuVar = dssu.b;
        this.c = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0001\u0000\u0002ဉ\u0000\u0003က\u0001\u0005\u001b", new Object[]{"e", "a", "b", "c", dpmc.class});
            }
            if (i2 == 3) {
                return new dpmd();
            }
            if (i2 == 4) {
                return new dply();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpmd> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpmd.class) {
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
