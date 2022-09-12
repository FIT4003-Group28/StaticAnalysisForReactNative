package defpackage;
/* compiled from: PG */
/* renamed from: dsln  reason: default package */
/* loaded from: classes6.dex */
public final class dsln extends dsqw<dsln, dslm> implements dssk {
    public static final dsln a;
    private static volatile dssr<dsln> b;

    static {
        dsln dslnVar = new dsln();
        a = dslnVar;
        dsqw.cc(dsln.class, dslnVar);
    }

    private dsln() {
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
                return new dsln();
            }
            if (i2 == 4) {
                return new dslm();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsln> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dsln.class) {
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
