package defpackage;
/* compiled from: PG */
/* renamed from: dspt  reason: default package */
/* loaded from: classes6.dex */
public final class dspt extends dsqw<dspt, dsps> implements dssk {
    public static final dspt c;
    private static volatile dssr<dspt> d;
    public long a;
    public int b;

    static {
        dspt dsptVar = new dspt();
        c = dsptVar;
        dsqw.cc(dspt.class, dsptVar);
    }

    private dspt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dspt();
            }
            if (i2 == 4) {
                return new dsps();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dspt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dspt.class) {
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
