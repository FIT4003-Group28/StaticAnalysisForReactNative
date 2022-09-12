package defpackage;
/* compiled from: PG */
/* renamed from: cfgc  reason: default package */
/* loaded from: classes4.dex */
public final class cfgc extends dsqw<cfgc, cfgb> implements dssk {
    public static final cfgc d;
    private static volatile dssr<cfgc> e;
    public int a;
    public dspd b = dspd.b;
    public dpum c;

    static {
        cfgc cfgcVar = new cfgc();
        d = cfgcVar;
        dsqw.cc(cfgc.class, cfgcVar);
    }

    private cfgc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new cfgc();
            }
            if (i2 == 4) {
                return new cfgb();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cfgc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cfgc.class) {
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
