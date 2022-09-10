package defpackage;
/* compiled from: PG */
/* renamed from: dsdf  reason: default package */
/* loaded from: classes6.dex */
public final class dsdf extends dsqw<dsdf, dsde> implements dssk {
    public static final dsdf a;
    private static volatile dssr<dsdf> b;

    static {
        dsdf dsdfVar = new dsdf();
        a = dsdfVar;
        dsqw.cc(dsdf.class, dsdfVar);
    }

    private dsdf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dsdf();
            }
            if (i2 == 4) {
                return new dsde();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsdf> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dsdf.class) {
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
