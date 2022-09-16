package defpackage;
/* compiled from: PG */
/* renamed from: dpfx  reason: default package */
/* loaded from: classes6.dex */
public final class dpfx extends dsqw<dpfx, dpfq> implements dssk {
    public static final dpfx f;
    private static volatile dssr<dpfx> g;
    public int a;
    public dpfw d;
    public String b = "";
    public dsrj<dpfu> c = dssu.b;
    public dsrj<dpfp> e = dssu.b;

    static {
        dpfx dpfxVar = new dpfx();
        f = dpfxVar;
        dsqw.cc(dpfx.class, dpfxVar);
    }

    private dpfx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0000\u0001\u001b\u0002ဉ\u0002\u0003\u001b\u0005ဈ\u0001", new Object[]{"a", "c", dpfu.class, "d", "e", dpfp.class, "b"});
            }
            if (i2 == 3) {
                return new dpfx();
            }
            if (i2 == 4) {
                return new dpfq();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpfx> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dpfx.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
