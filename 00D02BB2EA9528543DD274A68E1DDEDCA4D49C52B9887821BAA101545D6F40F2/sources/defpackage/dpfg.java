package defpackage;
/* compiled from: PG */
/* renamed from: dpfg  reason: default package */
/* loaded from: classes6.dex */
public final class dpfg extends dsqw<dpfg, dpff> implements dssk {
    public static final dpfg d;
    private static volatile dssr<dpfg> e;
    public int a;
    public int b;
    public int c;

    static {
        dpfg dpfgVar = new dpfg();
        d = dpfgVar;
        dsqw.cc(dpfg.class, dpfgVar);
    }

    private dpfg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dpfg();
            }
            if (i2 == 4) {
                return new dpff();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpfg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpfg.class) {
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
