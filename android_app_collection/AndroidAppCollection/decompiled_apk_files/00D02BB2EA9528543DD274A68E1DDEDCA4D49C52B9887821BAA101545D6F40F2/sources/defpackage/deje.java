package defpackage;
/* compiled from: PG */
/* renamed from: deje  reason: default package */
/* loaded from: classes6.dex */
public final class deje extends dsqw<deje, dejd> implements dssk {
    public static final deje g;
    private static volatile dssr<deje> h;
    public String a = "";
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;

    static {
        deje dejeVar = new deje();
        g = dejeVar;
        dsqw.cc(deje.class, dejeVar);
    }

    private deje() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\f\u0005\f\u0006\u0007", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new deje();
            }
            if (i2 == 4) {
                return new dejd();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<deje> dssrVar = h;
            if (dssrVar == null) {
                synchronized (deje.class) {
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
