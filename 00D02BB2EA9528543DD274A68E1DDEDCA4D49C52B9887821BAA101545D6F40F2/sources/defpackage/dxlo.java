package defpackage;
/* compiled from: PG */
/* renamed from: dxlo  reason: default package */
/* loaded from: classes6.dex */
public final class dxlo extends dsqw<dxlo, dxln> implements dssk {
    public static final dxlo c;
    private static volatile dssr<dxlo> d;
    public int a;
    public long b;

    static {
        dxlo dxloVar = new dxlo();
        c = dxloVar;
        dsqw.cc(dxlo.class, dxloVar);
    }

    private dxlo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\f\u0003\u0002", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dxlo();
            }
            if (i2 == 4) {
                return new dxln();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxlo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxlo.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
