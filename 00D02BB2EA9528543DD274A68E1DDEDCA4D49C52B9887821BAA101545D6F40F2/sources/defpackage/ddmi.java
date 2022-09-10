package defpackage;
/* compiled from: PG */
/* renamed from: ddmi  reason: default package */
/* loaded from: classes6.dex */
public final class ddmi extends dsqw<ddmi, ddmh> implements dssk {
    public static final ddmi e;
    private static volatile dssr<ddmi> f;
    public int a;
    public int b;
    public float c;
    public float d;

    static {
        ddmi ddmiVar = new ddmi();
        e = ddmiVar;
        dsqw.cc(ddmi.class, ddmiVar);
    }

    private ddmi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ddmi();
            }
            if (i2 == 4) {
                return new ddmh();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddmi> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddmi.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
