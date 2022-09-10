package defpackage;
/* compiled from: PG */
/* renamed from: csrx  reason: default package */
/* loaded from: classes5.dex */
public final class csrx extends dsqw<csrx, csrw> implements dssk {
    public static final csrx e;
    private static volatile dssr<csrx> g;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    private int f;

    static {
        csrx csrxVar = new csrx();
        e = csrxVar;
        dsqw.cc(csrx.class, csrxVar);
    }

    private csrx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new csrx();
            }
            if (i2 == 4) {
                return new csrw();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<csrx> dssrVar = g;
            if (dssrVar == null) {
                synchronized (csrx.class) {
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
