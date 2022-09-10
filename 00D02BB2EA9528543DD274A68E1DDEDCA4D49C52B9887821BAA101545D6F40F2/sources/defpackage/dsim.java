package defpackage;
/* compiled from: PG */
/* renamed from: dsim  reason: default package */
/* loaded from: classes6.dex */
public final class dsim extends dsqw<dsim, dsil> implements dssk {
    public static final dsim a;
    private static volatile dssr<dsim> b;

    static {
        dsim dsimVar = new dsim();
        a = dsimVar;
        dsqw.cc(dsim.class, dsimVar);
    }

    private dsim() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dsim();
            }
            if (i2 == 4) {
                return new dsil();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsim> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dsim.class) {
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
