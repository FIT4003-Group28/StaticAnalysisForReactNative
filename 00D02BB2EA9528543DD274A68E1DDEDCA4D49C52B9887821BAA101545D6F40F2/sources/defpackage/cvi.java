package defpackage;
/* compiled from: PG */
/* renamed from: cvi  reason: default package */
/* loaded from: classes5.dex */
public final class cvi extends dsqw<cvi, cvh> implements dssk {
    public static final cvi d;
    private static volatile dssr<cvi> e;
    public int a;
    public int b = 1;
    public int c = 65535;

    static {
        cvi cviVar = new cvi();
        d = cviVar;
        dsqw.cc(cvi.class, cviVar);
    }

    private cvi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003င\u0000\u0004င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new cvi();
            }
            if (i2 == 4) {
                return new cvh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cvi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cvi.class) {
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
