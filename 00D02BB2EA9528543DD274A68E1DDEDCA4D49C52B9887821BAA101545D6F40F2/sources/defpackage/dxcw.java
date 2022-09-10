package defpackage;
/* compiled from: PG */
/* renamed from: dxcw  reason: default package */
/* loaded from: classes6.dex */
public final class dxcw extends dsqw<dxcw, dxcv> implements dssk {
    public static final dxcw e;
    private static volatile dssr<dxcw> h;
    public int a;
    public dxdi b;
    private dxda f;
    private byte g = 2;
    public int c = 2;
    public dsrj<dxcu> d = dssu.b;

    static {
        dxcw dxcwVar = new dxcw();
        e = dxcwVar;
        dsqw.cc(dxcw.class, dxcwVar);
    }

    private dxcw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0002", new Object[]{"a", "f"});
            }
            if (i2 == 3) {
                return new dxcw();
            }
            if (i2 == 4) {
                return new dxcv();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dxcw> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dxcw.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
