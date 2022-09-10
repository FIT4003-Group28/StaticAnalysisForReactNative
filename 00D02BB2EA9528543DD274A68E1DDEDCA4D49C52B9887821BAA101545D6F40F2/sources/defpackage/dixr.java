package defpackage;
/* compiled from: PG */
/* renamed from: dixr  reason: default package */
/* loaded from: classes6.dex */
public final class dixr extends dsqw<dixr, dixo> implements dssk {
    public static final dixr g;
    private static volatile dssr<dixr> h;
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public dixq f;

    static {
        dixr dixrVar = new dixr();
        g = dixrVar;
        dsqw.cc(dixr.class, dixrVar);
    }

    private dixr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004င\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dixr();
            }
            if (i2 == 4) {
                return new dixo();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dixr> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dixr.class) {
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
