package defpackage;
/* compiled from: PG */
/* renamed from: dtsq  reason: default package */
/* loaded from: classes6.dex */
public final class dtsq extends dsqw<dtsq, dtso> implements dssk {
    public static final dtsq g;
    private static volatile dssr<dtsq> h;
    public int b;
    public String a = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        dtsq dtsqVar = new dtsq();
        g = dtsqVar;
        dsqw.cc(dtsq.class, dtsqVar);
    }

    private dtsq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001Ȉ\u0003\f\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dtsq();
            }
            if (i2 == 4) {
                return new dtso();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtsq> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dtsq.class) {
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
