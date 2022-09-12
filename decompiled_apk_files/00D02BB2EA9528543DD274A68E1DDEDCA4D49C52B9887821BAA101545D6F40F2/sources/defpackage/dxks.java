package defpackage;
/* compiled from: PG */
/* renamed from: dxks  reason: default package */
/* loaded from: classes6.dex */
public final class dxks extends dsqw<dxks, dxkr> implements dssk {
    public static final dxks d;
    private static volatile dssr<dxks> e;
    public int a = 0;
    public Object b;
    public int c;

    static {
        dxks dxksVar = new dxks();
        d = dxksVar;
        dsqw.cc(dxks.class, dxksVar);
    }

    private dxks() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0002\u0001\u0000\u0001\u000b\u0002\u0000\u0000\u0000\u0001\f\u000b<\u0000", new Object[]{"b", "a", "c", dxlh.class});
            }
            if (i2 == 3) {
                return new dxks();
            }
            if (i2 == 4) {
                return new dxkr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxks> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxks.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
