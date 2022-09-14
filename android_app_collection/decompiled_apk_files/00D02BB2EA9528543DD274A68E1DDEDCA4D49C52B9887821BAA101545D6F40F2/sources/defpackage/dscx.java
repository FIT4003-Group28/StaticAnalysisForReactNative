package defpackage;
/* compiled from: PG */
/* renamed from: dscx  reason: default package */
/* loaded from: classes6.dex */
public final class dscx extends dsqw<dscx, dscw> implements dssk {
    public static final dscx c;
    private static volatile dssr<dscx> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        dscx dscxVar = new dscx();
        c = dscxVar;
        dsqw.cc(dscx.class, dscxVar);
    }

    private dscx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dscx();
            }
            if (i2 == 4) {
                return new dscw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dscx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dscx.class) {
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
