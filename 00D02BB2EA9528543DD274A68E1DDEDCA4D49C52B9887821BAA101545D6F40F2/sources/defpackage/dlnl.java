package defpackage;
/* compiled from: PG */
/* renamed from: dlnl  reason: default package */
/* loaded from: classes6.dex */
public final class dlnl extends dsqw<dlnl, dlni> implements dssk {
    public static final dlnl c;
    private static volatile dssr<dlnl> e;
    public String a = "";
    public dsrj<dlnk> b = dssu.b;
    private int d;

    static {
        dlnl dlnlVar = new dlnl();
        c = dlnlVar;
        dsqw.cc(dlnl.class, dlnlVar);
    }

    private dlnl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", dlnk.class});
            }
            if (i2 == 3) {
                return new dlnl();
            }
            if (i2 == 4) {
                return new dlni();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlnl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlnl.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
