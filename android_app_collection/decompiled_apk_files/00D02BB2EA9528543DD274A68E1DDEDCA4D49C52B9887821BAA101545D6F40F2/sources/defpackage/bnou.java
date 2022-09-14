package defpackage;
/* compiled from: PG */
/* renamed from: bnou  reason: default package */
/* loaded from: classes3.dex */
public final class bnou extends dsqw<bnou, bnot> implements dssk {
    public static final bnou d;
    private static volatile dssr<bnou> e;
    public int a;
    public dtbm b;
    public String c = "";

    static {
        bnou bnouVar = new bnou();
        d = bnouVar;
        dsqw.cc(bnou.class, bnouVar);
    }

    private bnou() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new bnou();
            }
            if (i2 == 4) {
                return new bnot();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bnou> dssrVar = e;
            if (dssrVar == null) {
                synchronized (bnou.class) {
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
