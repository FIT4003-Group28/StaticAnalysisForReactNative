package defpackage;
/* compiled from: PG */
/* renamed from: djhn  reason: default package */
/* loaded from: classes6.dex */
public final class djhn extends dsqw<djhn, djhk> implements dssk {
    public static final djhn d;
    private static volatile dssr<djhn> e;
    public int a;
    public int b;
    public String c = "";

    static {
        djhn djhnVar = new djhn();
        d = djhnVar;
        dsqw.cc(djhn.class, djhnVar);
    }

    private djhn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", djhl.a, "c"});
            }
            if (i2 == 3) {
                return new djhn();
            }
            if (i2 == 4) {
                return new djhk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djhn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djhn.class) {
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
