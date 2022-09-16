package defpackage;
/* compiled from: PG */
/* renamed from: dxbv  reason: default package */
/* loaded from: classes6.dex */
public final class dxbv extends dsqw<dxbv, dxbu> implements dssk {
    public static final dxbv c;
    private static volatile dssr<dxbv> d;
    public int a = 0;
    public Object b;

    static {
        dxbv dxbvVar = new dxbv();
        c = dxbvVar;
        dsqw.cc(dxbv.class, dxbvVar);
    }

    private dxbv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", dxbt.class});
            }
            if (i2 == 3) {
                return new dxbv();
            }
            if (i2 == 4) {
                return new dxbu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxbv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxbv.class) {
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
