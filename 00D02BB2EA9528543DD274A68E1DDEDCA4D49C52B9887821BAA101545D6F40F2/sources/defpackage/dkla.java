package defpackage;
/* compiled from: PG */
/* renamed from: dkla  reason: default package */
/* loaded from: classes6.dex */
public final class dkla extends dsqw<dkla, dkkz> implements dssk {
    public static final dkla a;
    private static volatile dssr<dkla> b;

    static {
        dkla dklaVar = new dkla();
        a = dklaVar;
        dsqw.cc(dkla.class, dklaVar);
    }

    private dkla() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dkla();
            }
            if (i2 == 4) {
                return new dkkz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkla> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dkla.class) {
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
