package defpackage;
/* compiled from: PG */
/* renamed from: dsxb  reason: default package */
/* loaded from: classes6.dex */
public final class dsxb extends dsqw<dsxb, dsxa> implements dssk {
    public static final dsxb a;
    private static volatile dssr<dsxb> b;

    static {
        dsxb dsxbVar = new dsxb();
        a = dsxbVar;
        dsqw.cc(dsxb.class, dsxbVar);
    }

    private dsxb() {
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
                return new dsxb();
            }
            if (i2 == 4) {
                return new dsxa();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsxb> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dsxb.class) {
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
