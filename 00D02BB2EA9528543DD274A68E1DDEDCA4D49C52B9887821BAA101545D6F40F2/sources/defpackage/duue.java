package defpackage;
/* compiled from: PG */
/* renamed from: duue  reason: default package */
/* loaded from: classes6.dex */
public final class duue extends dsqw<duue, duud> implements dssk {
    public static final duue g;
    private static volatile dssr<duue> i;
    public float a;
    public float b;
    public float c = 10.0f;
    public int d = 6000;
    public float e = 10.0f;
    public float f = 10.0f;
    private int h;

    static {
        duue duueVar = new duue();
        g = duueVar;
        dsqw.cc(duue.class, duueVar);
    }

    private duue() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004င\u0003\u0006ခ\u0004\u0007ခ\u0005", new Object[]{"h", "a", "b", "c", "d", "e", "f"});
            }
            if (i3 == 3) {
                return new duue();
            }
            if (i3 == 4) {
                return new duud();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<duue> dssrVar = i;
            if (dssrVar == null) {
                synchronized (duue.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
