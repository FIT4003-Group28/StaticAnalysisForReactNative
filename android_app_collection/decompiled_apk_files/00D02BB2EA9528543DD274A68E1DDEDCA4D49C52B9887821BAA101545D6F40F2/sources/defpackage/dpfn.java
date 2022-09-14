package defpackage;
/* compiled from: PG */
/* renamed from: dpfn  reason: default package */
/* loaded from: classes6.dex */
public final class dpfn extends dsqw<dpfn, dpfm> implements dssk {
    public static final dpfn e;
    private static volatile dssr<dpfn> g;
    public String a = "";
    public float b;
    public int c;
    public int d;
    private int f;

    static {
        dpfn dpfnVar = new dpfn();
        e = dpfnVar;
        dsqw.cc(dpfn.class, dpfnVar);
    }

    private dpfn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"f", "a", "b", "c", dpfk.a, "d", dpfi.a});
            }
            if (i2 == 3) {
                return new dpfn();
            }
            if (i2 == 4) {
                return new dpfm();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpfn> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dpfn.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
