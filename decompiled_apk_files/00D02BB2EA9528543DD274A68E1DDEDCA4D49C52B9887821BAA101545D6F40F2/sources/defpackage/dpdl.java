package defpackage;
/* compiled from: PG */
/* renamed from: dpdl  reason: default package */
/* loaded from: classes6.dex */
public final class dpdl extends dsqw<dpdl, dpdk> implements dssk {
    public static final dpdl d;
    private static volatile dssr<dpdl> e;
    public int a;
    public boolean b;
    public String c = "";

    static {
        dpdl dpdlVar = new dpdl();
        d = dpdlVar;
        dsqw.cc(dpdl.class, dpdlVar);
    }

    private dpdl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dpdl();
            }
            if (i2 == 4) {
                return new dpdk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpdl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpdl.class) {
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
