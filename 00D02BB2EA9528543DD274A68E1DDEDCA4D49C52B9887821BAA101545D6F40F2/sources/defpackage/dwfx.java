package defpackage;
/* compiled from: PG */
/* renamed from: dwfx  reason: default package */
/* loaded from: classes.dex */
public final class dwfx extends dsqw<dwfx, dwfw> implements dssk {
    public static final dwfx d;
    private static volatile dssr<dwfx> f;
    public int a;
    public int b = 10;
    public String c = "";
    private boolean e;

    static {
        dwfx dwfxVar = new dwfx();
        d = dwfxVar;
        dsqw.cc(dwfx.class, dwfxVar);
    }

    private dwfx() {
    }

    public static /* synthetic */ void c(dwfx dwfxVar) {
        dwfxVar.a |= 8;
        dwfxVar.e = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "e"});
            }
            if (i2 == 3) {
                return new dwfx();
            }
            if (i2 == 4) {
                return new dwfw();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwfx> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwfx.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
