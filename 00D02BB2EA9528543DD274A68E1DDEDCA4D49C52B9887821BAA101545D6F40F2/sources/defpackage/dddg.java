package defpackage;
/* compiled from: PG */
/* renamed from: dddg  reason: default package */
/* loaded from: classes.dex */
public final class dddg extends dsqw<dddg, dddf> implements dssk {
    public static final dddg g;
    public static final dsqv<ddhk, dddg> h;
    private static volatile dssr<dddg> i;
    public int a;
    public dddo b;
    public dddr c;
    public dddi d;
    public dddt e;
    public dddk f;

    static {
        dddg dddgVar = new dddg();
        g = dddgVar;
        dsqw.cc(dddg.class, dddgVar);
        h = dsqw.newSingularGeneratedExtension(ddhk.k, dddgVar, dddgVar, null, 312, dsur.MESSAGE, dddg.class);
    }

    private dddg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0004ဉ\u0003\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i3 == 3) {
                return new dddg();
            }
            if (i3 == 4) {
                return new dddf();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dddg> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dddg.class) {
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
