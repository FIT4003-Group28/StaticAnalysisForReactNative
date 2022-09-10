package defpackage;
/* compiled from: PG */
/* renamed from: dlya  reason: default package */
/* loaded from: classes6.dex */
public final class dlya extends dsqw<dlya, dlxz> implements dssk {
    public static final dlya a;
    private static volatile dssr<dlya> b;

    static {
        dlya dlyaVar = new dlya();
        a = dlyaVar;
        dsqw.cc(dlya.class, dlyaVar);
    }

    private dlya() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dlya();
            }
            if (i2 == 4) {
                return new dlxz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlya> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dlya.class) {
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
