package defpackage;
/* compiled from: PG */
/* renamed from: diry  reason: default package */
/* loaded from: classes6.dex */
public final class diry extends dsqw<diry, dirx> implements dssk {
    public static final diry a;
    private static volatile dssr<diry> b;

    static {
        diry diryVar = new diry();
        a = diryVar;
        dsqw.cc(diry.class, diryVar);
    }

    private diry() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new diry();
            }
            if (i2 == 4) {
                return new dirx();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diry> dssrVar = b;
            if (dssrVar == null) {
                synchronized (diry.class) {
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
