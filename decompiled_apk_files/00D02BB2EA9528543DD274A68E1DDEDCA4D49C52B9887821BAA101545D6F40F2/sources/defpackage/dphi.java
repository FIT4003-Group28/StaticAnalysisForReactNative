package defpackage;
/* compiled from: PG */
/* renamed from: dphi  reason: default package */
/* loaded from: classes6.dex */
public final class dphi extends dsqw<dphi, dphh> implements dssk {
    public static final dphi c;
    private static volatile dssr<dphi> d;
    public int a;
    public int b;

    static {
        dphi dphiVar = new dphi();
        c = dphiVar;
        dsqw.cc(dphi.class, dphiVar);
    }

    private dphi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dqvj.d()});
            }
            if (i2 == 3) {
                return new dphi();
            }
            if (i2 == 4) {
                return new dphh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dphi> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dphi.class) {
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