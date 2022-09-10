package defpackage;
/* compiled from: PG */
/* renamed from: domd  reason: default package */
/* loaded from: classes.dex */
public final class domd extends dsqw<domd, domc> implements dssk {
    public static final domd d;
    private static volatile dssr<domd> e;
    public int a;
    public domf b;
    public dqkd c;

    static {
        domd domdVar = new domd();
        d = domdVar;
        dsqw.cc(domd.class, domdVar);
    }

    private domd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new domd();
            }
            if (i2 == 4) {
                return new domc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<domd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (domd.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
