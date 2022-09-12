package defpackage;
/* compiled from: PG */
/* renamed from: dkfb  reason: default package */
/* loaded from: classes6.dex */
public final class dkfb extends dsqw<dkfb, dkfa> implements dssk {
    public static final dkfb a;
    private static volatile dssr<dkfb> b;

    static {
        dkfb dkfbVar = new dkfb();
        a = dkfbVar;
        dsqw.cc(dkfb.class, dkfbVar);
    }

    private dkfb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dkfb();
            }
            if (i2 == 4) {
                return new dkfa();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkfb> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dkfb.class) {
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
