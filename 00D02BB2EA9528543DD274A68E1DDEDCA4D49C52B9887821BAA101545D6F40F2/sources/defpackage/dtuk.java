package defpackage;
/* compiled from: PG */
/* renamed from: dtuk  reason: default package */
/* loaded from: classes6.dex */
public final class dtuk extends dsqw<dtuk, dtuj> implements dssk {
    public static final dtuk a;
    private static volatile dssr<dtuk> b;

    static {
        dtuk dtukVar = new dtuk();
        a = dtukVar;
        dsqw.cc(dtuk.class, dtukVar);
    }

    private dtuk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dtuk();
            }
            if (i2 == 4) {
                return new dtuj();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtuk> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtuk.class) {
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
