package defpackage;
/* compiled from: PG */
/* renamed from: dffx  reason: default package */
/* loaded from: classes6.dex */
public final class dffx extends dsqw<dffx, dffw> implements dssk {
    public static final dffx e;
    private static volatile dssr<dffx> g;
    public int a;
    public Object c;
    public int b = 0;
    private byte f = 2;
    public String d = "";

    static {
        dffx dffxVar = new dffx();
        e = dffxVar;
        dsqw.cc(dffx.class, dffxVar);
    }

    private dffx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ျ\u0000\u0003ᐼ\u0000", new Object[]{"c", "b", "a", "d", drte.class});
            }
            if (i2 == 3) {
                return new dffx();
            }
            if (i2 == 4) {
                return new dffw();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dffx> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dffx.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
