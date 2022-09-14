package defpackage;
/* compiled from: PG */
/* renamed from: dmnv  reason: default package */
/* loaded from: classes.dex */
public final class dmnv extends dsqw<dmnv, dmnu> implements dssk {
    public static final dmnv a;
    private static volatile dssr<dmnv> b;

    static {
        dmnv dmnvVar = new dmnv();
        a = dmnvVar;
        dsqw.cc(dmnv.class, dmnvVar);
    }

    private dmnv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dmnv();
            }
            if (i2 == 4) {
                return new dmnu();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmnv> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dmnv.class) {
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
