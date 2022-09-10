package defpackage;
/* compiled from: PG */
/* renamed from: dizj  reason: default package */
/* loaded from: classes6.dex */
public final class dizj extends dsqw<dizj, dizi> implements dssk {
    public static final dizj g;
    private static volatile dssr<dizj> h;
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;

    static {
        dizj dizjVar = new dizj();
        g = dizjVar;
        dsqw.cc(dizj.class, dizjVar);
    }

    private dizj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0005\t\u0005\u0000\u0000\u0000\u0005ခ\u0000\u0006ခ\u0001\u0007ခ\u0002\bခ\u0003\tခ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dizj();
            }
            if (i2 == 4) {
                return new dizi();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dizj> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dizj.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
