package defpackage;
/* compiled from: PG */
/* renamed from: doxw  reason: default package */
/* loaded from: classes6.dex */
public final class doxw extends dsqw<doxw, doxv> implements dssk {
    public static final doxw e;
    private static volatile dssr<doxw> f;
    public int a;
    public dsrj<dotx> b = dssu.b;
    public String c = "";
    public dspd d = dspd.b;

    static {
        doxw doxwVar = new doxw();
        e = doxwVar;
        dsqw.cc(doxw.class, doxwVar);
    }

    private doxw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ည\u0001", new Object[]{"a", "b", dotx.class, "c", "d"});
            }
            if (i2 == 3) {
                return new doxw();
            }
            if (i2 == 4) {
                return new doxv();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doxw> dssrVar = f;
            if (dssrVar == null) {
                synchronized (doxw.class) {
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
