package defpackage;
/* compiled from: PG */
/* renamed from: dlxk  reason: default package */
/* loaded from: classes6.dex */
public final class dlxk extends dsqw<dlxk, dlxj> implements dssk {
    public static final dlxk e;
    private static volatile dssr<dlxk> g;
    public dggg a;
    public dhjx b;
    public dlwi c;
    public dlwk d;
    private int f;

    static {
        dlxk dlxkVar = new dlxk();
        e = dlxkVar;
        dsqw.cc(dlxk.class, dlxkVar);
    }

    private dlxk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dlxk();
            }
            if (i2 == 4) {
                return new dlxj();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlxk> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlxk.class) {
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
