package defpackage;
/* compiled from: PG */
/* renamed from: dorc  reason: default package */
/* loaded from: classes6.dex */
public final class dorc extends dsqw<dorc, doqx> implements dssk {
    public static final dorc e;
    private static volatile dssr<dorc> f;
    public int a;
    public String b = "";
    public int c;
    public doqz d;

    static {
        dorc dorcVar = new dorc();
        e = dorcVar;
        dsqw.cc(dorc.class, dorcVar);
    }

    private dorc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", dora.a, "d"});
            }
            if (i2 == 3) {
                return new dorc();
            }
            if (i2 == 4) {
                return new doqx();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dorc> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dorc.class) {
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
