package defpackage;
/* compiled from: PG */
/* renamed from: dive  reason: default package */
/* loaded from: classes6.dex */
public final class dive extends dsqw<dive, divd> implements dssk {
    public static final dive d;
    private static volatile dssr<dive> f;
    public dsrj<dwfl> a = dssu.b;
    public boolean b;
    public boolean c;
    private int e;

    static {
        dive diveVar = new dive();
        d = diveVar;
        dsqw.cc(dive.class, diveVar);
    }

    private dive() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဇ\u0001", new Object[]{"e", "a", dwfl.class, "b", "c"});
            }
            if (i2 == 3) {
                return new dive();
            }
            if (i2 == 4) {
                return new divd();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dive> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dive.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
