package defpackage;
/* compiled from: PG */
/* renamed from: dnnx  reason: default package */
/* loaded from: classes.dex */
public final class dnnx extends dsqw<dnnx, dnnw> implements dssk {
    public static final dnnx b;
    private static volatile dssr<dnnx> c;
    public dsrj<dnob> a = dssu.b;

    static {
        dnnx dnnxVar = new dnnx();
        b = dnnxVar;
        dsqw.cc(dnnx.class, dnnxVar);
    }

    private dnnx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dnob.class});
            }
            if (i2 == 3) {
                return new dnnx();
            }
            if (i2 == 4) {
                return new dnnw();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnnx> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dnnx.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
