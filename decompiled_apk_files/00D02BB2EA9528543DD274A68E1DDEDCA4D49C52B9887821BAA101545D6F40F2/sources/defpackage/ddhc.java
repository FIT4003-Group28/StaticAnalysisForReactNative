package defpackage;
/* compiled from: PG */
/* renamed from: ddhc  reason: default package */
/* loaded from: classes.dex */
public final class ddhc extends dsqw<ddhc, ddgz> implements dssk {
    public static final ddhc b;
    private static volatile dssr<ddhc> c;
    public dsrf a = dsqz.b;

    static {
        ddhc ddhcVar = new ddhc();
        b = ddhcVar;
        dsqw.cc(ddhc.class, ddhcVar);
    }

    private ddhc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", ddhb.c()});
            }
            if (i2 == 3) {
                return new ddhc();
            }
            if (i2 == 4) {
                return new ddgz();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddhc> dssrVar = c;
            if (dssrVar == null) {
                synchronized (ddhc.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
