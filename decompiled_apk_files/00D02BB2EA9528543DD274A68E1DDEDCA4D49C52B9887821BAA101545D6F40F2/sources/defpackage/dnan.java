package defpackage;
/* compiled from: PG */
/* renamed from: dnan  reason: default package */
/* loaded from: classes.dex */
public final class dnan extends dsqw<dnan, dnam> implements dssk {
    public static final dnan a;
    private static volatile dssr<dnan> b;

    static {
        dnan dnanVar = new dnan();
        a = dnanVar;
        dsqw.cc(dnan.class, dnanVar);
    }

    private dnan() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dnan();
            }
            if (i2 == 4) {
                return new dnam();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnan> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dnan.class) {
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
