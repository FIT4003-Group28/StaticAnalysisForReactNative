package defpackage;
/* compiled from: PG */
/* renamed from: dkwo  reason: default package */
/* loaded from: classes6.dex */
public final class dkwo extends dsqw<dkwo, dkwl> implements dssk {
    public static final dkwo b;
    private static volatile dssr<dkwo> d;
    public int a = 1;
    private int c;

    static {
        dkwo dkwoVar = new dkwo();
        b = dkwoVar;
        dsqw.cc(dkwo.class, dkwoVar);
    }

    private dkwo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဌ\u0004", new Object[]{"c", "a", dkwm.a});
            }
            if (i2 == 3) {
                return new dkwo();
            }
            if (i2 == 4) {
                return new dkwl();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkwo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkwo.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
