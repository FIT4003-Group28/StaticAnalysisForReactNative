package defpackage;
/* compiled from: PG */
/* renamed from: dlvt  reason: default package */
/* loaded from: classes6.dex */
public final class dlvt extends dsqw<dlvt, dlvs> implements dssk {
    public static final dlvt c;
    private static volatile dssr<dlvt> d;
    public int a;
    public dpsn b;

    static {
        dlvt dlvtVar = new dlvt();
        c = dlvtVar;
        dsqw.cc(dlvt.class, dlvtVar);
    }

    private dlvt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dlvt();
            }
            if (i2 == 4) {
                return new dlvs();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlvt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlvt.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
