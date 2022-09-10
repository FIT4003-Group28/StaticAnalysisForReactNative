package defpackage;
/* compiled from: PG */
/* renamed from: ckyz  reason: default package */
/* loaded from: classes5.dex */
public final class ckyz extends dsqw<ckyz, ckyy> implements dssk {
    public static final ckyz c;
    private static volatile dssr<ckyz> d;
    public int a;
    public boolean b;

    static {
        ckyz ckyzVar = new ckyz();
        c = ckyzVar;
        dsqw.cc(ckyz.class, ckyzVar);
    }

    private ckyz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ckyz();
            }
            if (i2 == 4) {
                return new ckyy();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckyz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ckyz.class) {
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
