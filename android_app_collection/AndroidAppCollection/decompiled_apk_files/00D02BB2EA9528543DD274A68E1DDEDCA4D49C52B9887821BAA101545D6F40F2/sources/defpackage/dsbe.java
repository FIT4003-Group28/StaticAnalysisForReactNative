package defpackage;
/* compiled from: PG */
/* renamed from: dsbe  reason: default package */
/* loaded from: classes6.dex */
public final class dsbe extends dsqw<dsbe, dsbd> implements dssk {
    public static final dsbe a;
    private static volatile dssr<dsbe> b;

    static {
        dsbe dsbeVar = new dsbe();
        a = dsbeVar;
        dsqw.cc(dsbe.class, dsbeVar);
    }

    private dsbe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dsbe();
            }
            if (i2 == 4) {
                return new dsbd();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsbe> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dsbe.class) {
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
