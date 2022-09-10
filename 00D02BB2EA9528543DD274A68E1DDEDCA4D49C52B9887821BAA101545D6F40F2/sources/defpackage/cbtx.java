package defpackage;
/* compiled from: PG */
/* renamed from: cbtx  reason: default package */
/* loaded from: classes4.dex */
public final class cbtx extends dsqw<cbtx, cbtw> implements dssk {
    public static final cbtx c;
    private static volatile dssr<cbtx> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        cbtx cbtxVar = new cbtx();
        c = cbtxVar;
        dsqw.cc(cbtx.class, cbtxVar);
    }

    private cbtx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new cbtx();
            }
            if (i2 == 4) {
                return new cbtw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cbtx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cbtx.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
