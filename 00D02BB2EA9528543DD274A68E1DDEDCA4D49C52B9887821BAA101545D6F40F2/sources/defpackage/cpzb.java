package defpackage;
/* compiled from: PG */
/* renamed from: cpzb  reason: default package */
/* loaded from: classes5.dex */
public final class cpzb extends dsqw<cpzb, cpza> implements dssk {
    public static final cpzb d;
    private static volatile dssr<cpzb> e;
    public int a;
    public int b;
    public long c;

    static {
        cpzb cpzbVar = new cpzb();
        d = cpzbVar;
        dsqw.cc(cpzb.class, cpzbVar);
    }

    private cpzb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", clai.a, "c"});
            }
            if (i2 == 3) {
                return new cpzb();
            }
            if (i2 == 4) {
                return new cpza();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cpzb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cpzb.class) {
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
