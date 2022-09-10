package defpackage;
/* compiled from: PG */
/* renamed from: duso  reason: default package */
/* loaded from: classes.dex */
public final class duso extends dsqw<duso, dusn> implements dssk {
    public static final duso a;
    private static volatile dssr<duso> b;

    static {
        duso dusoVar = new duso();
        a = dusoVar;
        dsqw.cc(duso.class, dusoVar);
    }

    private duso() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new duso();
            }
            if (i2 == 4) {
                return new dusn();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duso> dssrVar = b;
            if (dssrVar == null) {
                synchronized (duso.class) {
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
