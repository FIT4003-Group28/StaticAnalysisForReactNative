package defpackage;
/* compiled from: PG */
/* renamed from: dnnk  reason: default package */
/* loaded from: classes.dex */
public final class dnnk extends dsqw<dnnk, dnnj> implements dssk {
    public static final dnnk g;
    private static volatile dssr<dnnk> h;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;

    static {
        dnnk dnnkVar = new dnnk();
        g = dnnkVar;
        dsqw.cc(dnnk.class, dnnkVar);
    }

    private dnnk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0007ဇ\u0006\bဇ\u0007\tဇ\b", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dnnk();
            }
            if (i2 == 4) {
                return new dnnj();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnnk> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dnnk.class) {
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
