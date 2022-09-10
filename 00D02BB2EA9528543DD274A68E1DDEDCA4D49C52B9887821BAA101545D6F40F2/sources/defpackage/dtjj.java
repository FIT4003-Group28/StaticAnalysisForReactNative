package defpackage;
/* compiled from: PG */
/* renamed from: dtjj  reason: default package */
/* loaded from: classes6.dex */
public final class dtjj extends dsqw<dtjj, dtji> implements dssk {
    public static final dtjj d;
    private static volatile dssr<dtjj> e;
    public int a;
    public long b;
    public String c = "";

    static {
        dtjj dtjjVar = new dtjj();
        d = dtjjVar;
        dsqw.cc(dtjj.class, dtjjVar);
    }

    private dtjj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001စ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dtjj();
            }
            if (i2 == 4) {
                return new dtji();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtjj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtjj.class) {
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
