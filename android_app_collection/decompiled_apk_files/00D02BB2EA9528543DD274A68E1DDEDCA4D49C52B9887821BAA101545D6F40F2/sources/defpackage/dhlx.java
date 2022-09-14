package defpackage;
/* compiled from: PG */
/* renamed from: dhlx  reason: default package */
/* loaded from: classes6.dex */
public final class dhlx extends dsqw<dhlx, dhlw> implements dssk {
    public static final dhlx e;
    private static volatile dssr<dhlx> g;
    public float a = 2.0f;
    public float b = 10.0f;
    public float c = 1.0f;
    public float d = 1000.0f;
    private int f;

    static {
        dhlx dhlxVar = new dhlx();
        e = dhlxVar;
        dsqw.cc(dhlx.class, dhlxVar);
    }

    private dhlx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dhlx();
            }
            if (i2 == 4) {
                return new dhlw();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhlx> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dhlx.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
