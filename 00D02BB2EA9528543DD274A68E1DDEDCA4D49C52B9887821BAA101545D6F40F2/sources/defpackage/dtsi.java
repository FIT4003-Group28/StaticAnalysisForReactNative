package defpackage;
/* compiled from: PG */
/* renamed from: dtsi  reason: default package */
/* loaded from: classes6.dex */
public final class dtsi extends dsqw<dtsi, dtsh> implements dssk {
    public static final dtsi e;
    private static volatile dssr<dtsi> f;
    public int a;
    public int b;
    public String c = "";
    public boolean d;

    static {
        dtsi dtsiVar = new dtsi();
        e = dtsiVar;
        dsqw.cc(dtsi.class, dtsiVar);
    }

    private dtsi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003Ȉ\u0004\u0007", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dtsi();
            }
            if (i2 == 4) {
                return new dtsh();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtsi> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtsi.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
