package defpackage;
/* compiled from: PG */
/* renamed from: dvrx  reason: default package */
/* loaded from: classes6.dex */
public final class dvrx extends dsqw<dvrx, dvrw> implements dssk {
    public static final dvrx g;
    private static volatile dssr<dvrx> h;
    public int a;
    public String b = "";
    public String c = "";
    public int d;
    public int e;
    public boolean f;

    static {
        dvrx dvrxVar = new dvrx();
        g = dvrxVar;
        dsqw.cc(dvrx.class, dvrxVar);
    }

    private dvrx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဌ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", "c", "d", "e", dusg.a, "f"});
            }
            if (i2 == 3) {
                return new dvrx();
            }
            if (i2 == 4) {
                return new dvrw();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvrx> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dvrx.class) {
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
