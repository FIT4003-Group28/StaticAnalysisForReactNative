package defpackage;
/* compiled from: PG */
/* renamed from: dboi  reason: default package */
/* loaded from: classes5.dex */
public final class dboi extends dsqw<dboi, dboh> implements dssk {
    public static final dboi b;
    private static volatile dssr<dboi> c;
    public dsri a = dsrx.b;

    static {
        dboi dboiVar = new dboi();
        b = dboiVar;
        dsqw.cc(dboi.class, dboiVar);
    }

    private dboi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dboi();
            }
            if (i2 == 4) {
                return new dboh();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dboi> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dboi.class) {
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
