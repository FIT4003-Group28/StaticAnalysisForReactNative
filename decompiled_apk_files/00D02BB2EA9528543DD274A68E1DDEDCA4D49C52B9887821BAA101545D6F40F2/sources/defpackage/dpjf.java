package defpackage;
/* compiled from: PG */
/* renamed from: dpjf  reason: default package */
/* loaded from: classes6.dex */
public final class dpjf extends dsqw<dpjf, dpje> implements dssk {
    public static final dpjf c;
    private static volatile dssr<dpjf> d;
    public int a;
    public boolean b;

    static {
        dpjf dpjfVar = new dpjf();
        c = dpjfVar;
        dsqw.cc(dpjf.class, dpjfVar);
    }

    private dpjf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dpjf();
            }
            if (i2 == 4) {
                return new dpje();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpjf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpjf.class) {
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
