package defpackage;
/* compiled from: PG */
/* renamed from: cspb  reason: default package */
/* loaded from: classes5.dex */
public final class cspb extends dsqw<cspb, csoy> implements dssk {
    public static final cspb f;
    private static volatile dssr<cspb> g;
    public int a;
    public int b = 0;
    public Object c;
    public int d;
    public cspa e;

    static {
        cspb cspbVar = new cspb();
        f = cspbVar;
        dsqw.cc(cspb.class, cspbVar);
    }

    private cspb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ြ\u0000\u0002င\u0005\u0003ဉ\u0006\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000", new Object[]{"c", "b", "a", csph.class, "d", "e", cspd.class, corn.class, cspj.class, cspf.class});
            }
            if (i2 == 3) {
                return new cspb();
            }
            if (i2 == 4) {
                return new csoy();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cspb> dssrVar = g;
            if (dssrVar == null) {
                synchronized (cspb.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
