package defpackage;
/* compiled from: PG */
/* renamed from: dwwx  reason: default package */
/* loaded from: classes6.dex */
public final class dwwx extends dsqw<dwwx, dwww> implements dssk {
    public static final dwwx c;
    private static volatile dssr<dwwx> f;
    public int a;
    private boolean e;
    private int d = 5;
    public String b = "";

    static {
        dwwx dwwxVar = new dwwx();
        c = dwwxVar;
        dsqw.cc(dwwx.class, dwwxVar);
    }

    private dwwx() {
    }

    public static /* synthetic */ void c(dwwx dwwxVar) {
        dwwxVar.a |= 1;
        dwwxVar.d = 20;
    }

    public static /* synthetic */ void e(dwwx dwwxVar) {
        dwwxVar.a |= 4;
        dwwxVar.e = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"a", "d", "b", "e"});
            }
            if (i2 == 3) {
                return new dwwx();
            }
            if (i2 == 4) {
                return new dwww();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwwx> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwwx.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
