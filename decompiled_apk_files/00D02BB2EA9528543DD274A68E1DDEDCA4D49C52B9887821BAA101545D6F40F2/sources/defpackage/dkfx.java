package defpackage;
/* compiled from: PG */
/* renamed from: dkfx  reason: default package */
/* loaded from: classes6.dex */
public final class dkfx extends dsqw<dkfx, dkfw> implements dssk {
    public static final dkfx d;
    private static volatile dssr<dkfx> e;
    public int a;
    public dsrj<dkfv> b = dssu.b;
    public dkfv c;

    static {
        dkfx dkfxVar = new dkfx();
        d = dkfxVar;
        dsqw.cc(dkfx.class, dkfxVar);
    }

    private dkfx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003ဉ\u0000", new Object[]{"a", "b", dkfv.class, "c"});
            }
            if (i2 == 3) {
                return new dkfx();
            }
            if (i2 == 4) {
                return new dkfw();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkfx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkfx.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
