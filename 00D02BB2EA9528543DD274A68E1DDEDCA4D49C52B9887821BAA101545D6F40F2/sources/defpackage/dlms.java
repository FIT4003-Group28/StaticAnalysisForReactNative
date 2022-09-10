package defpackage;
/* compiled from: PG */
/* renamed from: dlms  reason: default package */
/* loaded from: classes6.dex */
public final class dlms extends dsqw<dlms, dlmn> implements dssk {
    public static final dlms e;
    private static volatile dssr<dlms> g;
    public String a = "";
    public String b = "";
    public String c = "";
    public dsrj<dlmr> d = dssu.b;
    private int f;

    static {
        dlms dlmsVar = new dlms();
        e = dlmsVar;
        dsqw.cc(dlms.class, dlmsVar);
    }

    private dlms() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b", new Object[]{"f", "a", "b", "c", "d", dlmr.class});
            }
            if (i2 == 3) {
                return new dlms();
            }
            if (i2 == 4) {
                return new dlmn();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlms> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlms.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
