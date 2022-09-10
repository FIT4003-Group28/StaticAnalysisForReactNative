package defpackage;
/* compiled from: PG */
/* renamed from: dtug  reason: default package */
/* loaded from: classes6.dex */
public final class dtug extends dsqw<dtug, dtuf> implements dssk {
    public static final dtug a;
    private static volatile dssr<dtug> b;

    static {
        dtug dtugVar = new dtug();
        a = dtugVar;
        dsqw.cc(dtug.class, dtugVar);
    }

    private dtug() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dtug();
            }
            if (i2 == 4) {
                return new dtuf();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtug> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtug.class) {
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
