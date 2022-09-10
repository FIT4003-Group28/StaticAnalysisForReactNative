package defpackage;
/* compiled from: PG */
/* renamed from: bvyb  reason: default package */
/* loaded from: classes4.dex */
public final class bvyb extends dsqw<bvyb, bvya> implements dssk {
    public static final bvyb d;
    private static volatile dssr<bvyb> e;
    public int a;
    public long b;
    public int c;

    static {
        bvyb bvybVar = new bvyb();
        d = bvybVar;
        dsqw.cc(bvyb.class, bvybVar);
    }

    private bvyb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new bvyb();
            }
            if (i2 == 4) {
                return new bvya();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bvyb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (bvyb.class) {
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
