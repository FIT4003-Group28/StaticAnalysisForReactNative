package defpackage;
/* compiled from: PG */
/* renamed from: djhj  reason: default package */
/* loaded from: classes6.dex */
public final class djhj extends dsqw<djhj, djhi> implements dssk {
    public static final djhj d;
    private static volatile dssr<djhj> e;
    public int a;
    public dsrj<djhd> b = dssu.b;
    public int c;

    static {
        djhj djhjVar = new djhj();
        d = djhjVar;
        dsqw.cc(djhj.class, djhjVar);
    }

    private djhj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"a", "b", djhd.class, "c"});
            }
            if (i2 == 3) {
                return new djhj();
            }
            if (i2 == 4) {
                return new djhi();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djhj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djhj.class) {
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
