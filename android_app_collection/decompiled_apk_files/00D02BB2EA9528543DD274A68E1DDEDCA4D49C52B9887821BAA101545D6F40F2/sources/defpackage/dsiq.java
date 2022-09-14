package defpackage;
/* compiled from: PG */
/* renamed from: dsiq  reason: default package */
/* loaded from: classes6.dex */
public final class dsiq extends dsqw<dsiq, dsin> implements dssk {
    public static final dsiq b;
    private static volatile dssr<dsiq> c;
    public dsrj<dsip> a = dssu.b;

    static {
        dsiq dsiqVar = new dsiq();
        b = dsiqVar;
        dsqw.cc(dsiq.class, dsiqVar);
    }

    private dsiq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", dsip.class});
            }
            if (i2 == 3) {
                return new dsiq();
            }
            if (i2 == 4) {
                return new dsin();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsiq> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dsiq.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
