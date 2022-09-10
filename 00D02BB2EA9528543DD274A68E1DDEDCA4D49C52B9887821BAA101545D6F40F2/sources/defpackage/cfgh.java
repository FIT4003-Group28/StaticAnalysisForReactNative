package defpackage;
/* compiled from: PG */
/* renamed from: cfgh  reason: default package */
/* loaded from: classes4.dex */
public final class cfgh extends dsqw<cfgh, cfgg> implements dssk {
    public static final cfgh d;
    private static volatile dssr<cfgh> e;
    public int a;
    public dspd b = dspd.b;
    public cfgd c;

    static {
        cfgh cfghVar = new cfgh();
        d = cfghVar;
        dsqw.cc(cfgh.class, cfghVar);
    }

    private cfgh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new cfgh();
            }
            if (i2 == 4) {
                return new cfgg();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cfgh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cfgh.class) {
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
