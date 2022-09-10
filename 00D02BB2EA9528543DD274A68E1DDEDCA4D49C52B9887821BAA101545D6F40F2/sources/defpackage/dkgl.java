package defpackage;
/* compiled from: PG */
/* renamed from: dkgl  reason: default package */
/* loaded from: classes6.dex */
public final class dkgl extends dsqw<dkgl, dkgk> implements dssk {
    public static final dkgl d;
    private static volatile dssr<dkgl> f;
    public int a;
    public dsrj<dkgj> b = dssu.b;
    public float c;
    private int e;

    static {
        dkgl dkglVar = new dkgl();
        d = dkglVar;
        dsqw.cc(dkgl.class, dkglVar);
    }

    private dkgl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002\u001b\u0003ခ\u0001", new Object[]{"e", "a", "b", dkgj.class, "c"});
            }
            if (i2 == 3) {
                return new dkgl();
            }
            if (i2 == 4) {
                return new dkgk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkgl> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkgl.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
