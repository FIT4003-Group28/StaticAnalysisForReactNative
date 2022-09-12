package defpackage;
/* compiled from: PG */
/* renamed from: djfc  reason: default package */
/* loaded from: classes6.dex */
public final class djfc extends dsqw<djfc, djfb> implements dssk {
    public static final djfc a;
    private static volatile dssr<djfc> b;

    static {
        djfc djfcVar = new djfc();
        a = djfcVar;
        dsqw.cc(djfc.class, djfcVar);
    }

    private djfc() {
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
                return new djfc();
            }
            if (i2 == 4) {
                return new djfb();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djfc> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djfc.class) {
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
