package defpackage;
/* compiled from: PG */
/* renamed from: djaz  reason: default package */
/* loaded from: classes6.dex */
public final class djaz extends dsqw<djaz, djay> implements dssk {
    public static final djaz a;
    private static volatile dssr<djaz> b;

    static {
        djaz djazVar = new djaz();
        a = djazVar;
        dsqw.cc(djaz.class, djazVar);
    }

    private djaz() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djaz();
            }
            if (i2 == 4) {
                return new djay();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djaz> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djaz.class) {
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
