package defpackage;
/* compiled from: PG */
/* renamed from: aviz  reason: default package */
/* loaded from: classes3.dex */
public final class aviz extends dsqw<aviz, aviy> implements dssk {
    public static final aviz d;
    private static volatile dssr<aviz> e;
    public int a;
    public float b;
    public int c;

    static {
        aviz avizVar = new aviz();
        d = avizVar;
        dsqw.cc(aviz.class, avizVar);
    }

    private aviz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new aviz();
            }
            if (i2 == 4) {
                return new aviy();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aviz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (aviz.class) {
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
