package defpackage;
/* compiled from: PG */
/* renamed from: dkfg  reason: default package */
/* loaded from: classes6.dex */
public final class dkfg extends dsqw<dkfg, dkff> implements dssk {
    public static final dkfg d;
    private static volatile dssr<dkfg> e;
    public int a;
    public dspd b = dspd.b;
    public dpum c;

    static {
        dkfg dkfgVar = new dkfg();
        d = dkfgVar;
        dsqw.cc(dkfg.class, dkfgVar);
    }

    private dkfg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dkfg();
            }
            if (i2 == 4) {
                return new dkff();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkfg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkfg.class) {
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
