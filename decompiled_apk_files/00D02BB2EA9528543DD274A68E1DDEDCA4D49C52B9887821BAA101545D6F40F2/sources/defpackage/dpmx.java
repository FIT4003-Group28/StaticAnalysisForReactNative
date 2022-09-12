package defpackage;
/* compiled from: PG */
/* renamed from: dpmx  reason: default package */
/* loaded from: classes6.dex */
public final class dpmx extends dsqw<dpmx, dpmw> implements dssk {
    public static final dpmx c;
    private static volatile dssr<dpmx> d;
    public int a;
    public String b = "";

    static {
        dpmx dpmxVar = new dpmx();
        c = dpmxVar;
        dsqw.cc(dpmx.class, dpmxVar);
    }

    private dpmx() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dpmx();
            }
            if (i2 == 4) {
                return new dpmw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpmx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpmx.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
