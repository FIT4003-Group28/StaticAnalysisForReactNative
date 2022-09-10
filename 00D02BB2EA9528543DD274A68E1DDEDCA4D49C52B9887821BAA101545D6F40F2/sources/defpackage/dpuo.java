package defpackage;
/* compiled from: PG */
/* renamed from: dpuo  reason: default package */
/* loaded from: classes6.dex */
public final class dpuo extends dsqw<dpuo, dpun> implements dssk {
    public static final dpuo b;
    private static volatile dssr<dpuo> c;
    public dsrj<dpum> a = dssu.b;

    static {
        dpuo dpuoVar = new dpuo();
        b = dpuoVar;
        dsqw.cc(dpuo.class, dpuoVar);
    }

    private dpuo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dpum.class});
            }
            if (i2 == 3) {
                return new dpuo();
            }
            if (i2 == 4) {
                return new dpun();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpuo> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dpuo.class) {
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
