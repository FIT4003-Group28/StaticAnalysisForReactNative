package defpackage;
/* compiled from: PG */
/* renamed from: dqfw  reason: default package */
/* loaded from: classes6.dex */
public final class dqfw extends dsqw<dqfw, dqfv> implements dssk {
    public static final dqfw a;
    private static volatile dssr<dqfw> b;

    static {
        dqfw dqfwVar = new dqfw();
        a = dqfwVar;
        dsqw.cc(dqfw.class, dqfwVar);
    }

    private dqfw() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dqfw();
            }
            if (i2 == 4) {
                return new dqfv();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqfw> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dqfw.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
