package defpackage;
/* compiled from: PG */
/* renamed from: dlxq  reason: default package */
/* loaded from: classes.dex */
public final class dlxq extends dsqw<dlxq, dlxp> implements dssk {
    public static final dlxq b;
    private static volatile dssr<dlxq> c;
    public dsrj<dlxk> a = dssu.b;

    static {
        dlxq dlxqVar = new dlxq();
        b = dlxqVar;
        dsqw.cc(dlxq.class, dlxqVar);
    }

    private dlxq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dlxk.class});
            }
            if (i2 == 3) {
                return new dlxq();
            }
            if (i2 == 4) {
                return new dlxp();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlxq> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dlxq.class) {
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
