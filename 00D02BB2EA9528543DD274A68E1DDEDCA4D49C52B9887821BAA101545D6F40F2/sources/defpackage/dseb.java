package defpackage;
/* compiled from: PG */
/* renamed from: dseb  reason: default package */
/* loaded from: classes6.dex */
public final class dseb extends dsqw<dseb, dsea> implements dssk {
    public static final dseb a;
    private static volatile dssr<dseb> b;

    static {
        dseb dsebVar = new dseb();
        a = dsebVar;
        dsqw.cc(dseb.class, dsebVar);
    }

    private dseb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dseb();
            }
            if (i2 == 4) {
                return new dsea();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dseb> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dseb.class) {
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
