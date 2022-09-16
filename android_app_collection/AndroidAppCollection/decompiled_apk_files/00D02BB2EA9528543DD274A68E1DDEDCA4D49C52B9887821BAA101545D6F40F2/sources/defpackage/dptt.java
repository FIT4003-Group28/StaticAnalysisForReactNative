package defpackage;
/* compiled from: PG */
/* renamed from: dptt  reason: default package */
/* loaded from: classes6.dex */
public final class dptt extends dsqw<dptt, dptq> implements dssk {
    public static final dptt d;
    private static volatile dssr<dptt> e;
    public int a;
    public int b;
    public String c = "";

    static {
        dptt dpttVar = new dptt();
        d = dpttVar;
        dsqw.cc(dptt.class, dpttVar);
    }

    private dptt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", dptr.a, "c"});
            }
            if (i2 == 3) {
                return new dptt();
            }
            if (i2 == 4) {
                return new dptq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dptt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dptt.class) {
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
