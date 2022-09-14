package defpackage;
/* compiled from: PG */
/* renamed from: dukp  reason: default package */
/* loaded from: classes.dex */
public final class dukp extends dsqw<dukp, duko> implements dssk {
    public static final dukp g;
    private static volatile dssr<dukp> i;
    public boolean a;
    public boolean b = true;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    private int h;

    static {
        dukp dukpVar = new dukp();
        g = dukpVar;
        dsqw.cc(dukp.class, dukpVar);
    }

    private dukp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0006\u0015\u0006\u0000\u0000\u0000\u0006ဇ\u0002\bဇ\u0003\u0012ဇ\u000e\u0013ဇ\u000f\u0014ဇ\u0010\u0015ဇ\u0011", new Object[]{"h", "a", "b", "c", "d", "e", "f"});
            }
            if (i3 == 3) {
                return new dukp();
            }
            if (i3 == 4) {
                return new duko();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dukp> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dukp.class) {
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
