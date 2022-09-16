package defpackage;
/* compiled from: PG */
/* renamed from: drwi  reason: default package */
/* loaded from: classes6.dex */
public final class drwi extends dsqw<drwi, drwh> implements dssk {
    public static final drwi a;
    private static volatile dssr<drwi> b;

    static {
        drwi drwiVar = new drwi();
        a = drwiVar;
        dsqw.cc(drwi.class, drwiVar);
    }

    private drwi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new drwi();
            }
            if (i2 == 4) {
                return new drwh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drwi> dssrVar = b;
            if (dssrVar == null) {
                synchronized (drwi.class) {
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
