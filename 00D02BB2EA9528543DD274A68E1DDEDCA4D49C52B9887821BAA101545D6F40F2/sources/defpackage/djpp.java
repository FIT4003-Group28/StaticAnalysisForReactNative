package defpackage;
/* compiled from: PG */
/* renamed from: djpp  reason: default package */
/* loaded from: classes6.dex */
public final class djpp extends dsqw<djpp, djpo> implements dssk {
    public static final djpp a;
    private static volatile dssr<djpp> b;

    static {
        djpp djppVar = new djpp();
        a = djppVar;
        dsqw.cc(djpp.class, djppVar);
    }

    private djpp() {
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
                return new djpp();
            }
            if (i2 == 4) {
                return new djpo();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djpp> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djpp.class) {
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
