package defpackage;
/* compiled from: PG */
/* renamed from: cxle  reason: default package */
/* loaded from: classes5.dex */
public final class cxle extends dsqw<cxle, cxld> implements dssk {
    public static final cxle e;
    private static volatile dssr<cxle> g;
    public String a = "";
    public boolean b;
    public int c;
    public boolean d;
    private int f;

    static {
        cxle cxleVar = new cxle();
        e = cxleVar;
        dsqw.cc(cxle.class, cxleVar);
    }

    private cxle() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဌ\u0002\u0006ဇ\u0004", new Object[]{"f", "a", "b", "c", dekp.a, "d"});
            }
            if (i2 == 3) {
                return new cxle();
            }
            if (i2 == 4) {
                return new cxld();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cxle> dssrVar = g;
            if (dssrVar == null) {
                synchronized (cxle.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
