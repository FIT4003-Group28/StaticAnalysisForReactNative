package defpackage;
/* compiled from: PG */
/* renamed from: ddhw  reason: default package */
/* loaded from: classes.dex */
public final class ddhw extends dsqw<ddhw, ddhs> implements dssk {
    public static final ddhw d;
    private static volatile dssr<ddhw> e;
    public int a;
    public int b;
    public int c;

    static {
        ddhw ddhwVar = new ddhw();
        d = ddhwVar;
        dsqw.cc(ddhw.class, ddhwVar);
    }

    private ddhw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", ddhv.c(), "c", ddht.a});
            }
            if (i2 == 3) {
                return new ddhw();
            }
            if (i2 == 4) {
                return new ddhs();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddhw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddhw.class) {
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