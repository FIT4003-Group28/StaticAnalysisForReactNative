package defpackage;
/* compiled from: PG */
/* renamed from: dpxk  reason: default package */
/* loaded from: classes6.dex */
public final class dpxk extends dsqw<dpxk, dpxj> implements dssk {
    public static final dpxk c;
    private static volatile dssr<dpxk> d;
    public dsrj<dpwx> a = dssu.b;
    public dsrj<dpxh> b = dssu.b;

    static {
        dpxk dpxkVar = new dpxk();
        c = dpxkVar;
        dsqw.cc(dpxk.class, dpxkVar);
    }

    private dpxk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u001b\u0003\u001b", new Object[]{"a", dpwx.class, "b", dpxh.class});
            }
            if (i2 == 3) {
                return new dpxk();
            }
            if (i2 == 4) {
                return new dpxj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpxk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpxk.class) {
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
