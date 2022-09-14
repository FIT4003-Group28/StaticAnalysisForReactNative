package defpackage;
/* compiled from: PG */
/* renamed from: cxka  reason: default package */
/* loaded from: classes5.dex */
public final class cxka extends dsqw<cxka, cxjz> implements dssk {
    public static final cxka e;
    private static volatile dssr<cxka> f;
    public int a;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        cxka cxkaVar = new cxka();
        e = cxkaVar;
        dsqw.cc(cxka.class, cxkaVar);
    }

    private cxka() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u0001း\u0000\u0002်\u0000\u0003ဳ\u0000\u0004ျ\u0000\u0005ွ\u0000\nဈ\u0000", new Object[]{"c", "b", "a", "d"});
            }
            if (i2 == 3) {
                return new cxka();
            }
            if (i2 == 4) {
                return new cxjz();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cxka> dssrVar = f;
            if (dssrVar == null) {
                synchronized (cxka.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
