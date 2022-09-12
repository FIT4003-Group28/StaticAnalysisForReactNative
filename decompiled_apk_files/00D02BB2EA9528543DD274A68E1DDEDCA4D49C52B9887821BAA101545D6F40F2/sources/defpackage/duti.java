package defpackage;
/* compiled from: PG */
/* renamed from: duti  reason: default package */
/* loaded from: classes6.dex */
public final class duti extends dsqw<duti, duth> implements dssk {
    public static final duti a;
    private static volatile dssr<duti> b;

    static {
        duti dutiVar = new duti();
        a = dutiVar;
        dsqw.cc(duti.class, dutiVar);
    }

    private duti() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new duti();
            }
            if (i2 == 4) {
                return new duth();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duti> dssrVar = b;
            if (dssrVar == null) {
                synchronized (duti.class) {
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
