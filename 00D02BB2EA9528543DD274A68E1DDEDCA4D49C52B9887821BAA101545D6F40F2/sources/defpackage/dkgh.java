package defpackage;
/* compiled from: PG */
/* renamed from: dkgh  reason: default package */
/* loaded from: classes6.dex */
public final class dkgh extends dsqw<dkgh, dkgg> implements dssk {
    public static final dkgh d;
    private static volatile dssr<dkgh> f;
    public int a;
    public dsrj<dkfr> b = dssu.b;
    public dkgn c;
    private int e;

    static {
        dkgh dkghVar = new dkgh();
        d = dkghVar;
        dsqw.cc(dkgh.class, dkghVar);
    }

    private dkgh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"e", "a", "b", dkfr.class, "c"});
            }
            if (i2 == 3) {
                return new dkgh();
            }
            if (i2 == 4) {
                return new dkgg();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkgh> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkgh.class) {
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
