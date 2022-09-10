package defpackage;
/* compiled from: PG */
/* renamed from: dggx  reason: default package */
/* loaded from: classes6.dex */
public final class dggx extends dsqw<dggx, dggw> implements dssk {
    public static final dggx f;
    private static volatile dssr<dggx> h;
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    private int g;

    static {
        dggx dggxVar = new dggx();
        f = dggxVar;
        dsqw.cc(dggx.class, dggxVar);
    }

    private dggx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"g", "a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dggx();
            }
            if (i2 == 4) {
                return new dggw();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dggx> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dggx.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
