package defpackage;
/* compiled from: PG */
/* renamed from: dhdw  reason: default package */
/* loaded from: classes6.dex */
public final class dhdw extends dsqw<dhdw, dhdv> implements dssk {
    public static final dhdw g;
    private static volatile dssr<dhdw> h;
    public dsrj<String> a = dssu.b;
    public dhfp b;
    public dhdg c;
    public dhfg d;
    public dhdu e;
    public dhex f;

    static {
        dhdw dhdwVar = new dhdw();
        g = dhdwVar;
        dsqw.cc(dhdw.class, dhdwVar);
    }

    private dhdw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0000\u0006\u0000\u0000\u0001\b\u0006\u0000\u0001\u0000\u0001Ț\u0002\t\u0003\t\u0004\t\u0007\t\b\t", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dhdw();
            }
            if (i2 == 4) {
                return new dhdv();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhdw> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dhdw.class) {
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
