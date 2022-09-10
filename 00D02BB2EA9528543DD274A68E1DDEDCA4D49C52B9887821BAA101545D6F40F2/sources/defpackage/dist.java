package defpackage;
/* compiled from: PG */
/* renamed from: dist  reason: default package */
/* loaded from: classes6.dex */
public final class dist extends dsqw<dist, disq> implements dssk {
    public static final dist d;
    private static volatile dssr<dist> e;
    public int a;
    public dsrj<diss> b = dssu.b;
    public boolean c;

    static {
        dist distVar = new dist();
        d = distVar;
        dsqw.cc(dist.class, distVar);
    }

    private dist() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0004\u0006\u0002\u0000\u0001\u0000\u0004\u001b\u0006ဇ\u0000", new Object[]{"a", "b", diss.class, "c"});
            }
            if (i2 == 3) {
                return new dist();
            }
            if (i2 == 4) {
                return new disq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dist> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dist.class) {
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
