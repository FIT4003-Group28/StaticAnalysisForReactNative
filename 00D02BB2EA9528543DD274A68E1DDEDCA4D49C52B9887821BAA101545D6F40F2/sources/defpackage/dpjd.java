package defpackage;
/* compiled from: PG */
/* renamed from: dpjd  reason: default package */
/* loaded from: classes6.dex */
public final class dpjd extends dsqw<dpjd, dpjc> implements dssk {
    public static final dpjd d;
    private static volatile dssr<dpjd> e;
    public int a;
    public int b;
    public dnoh c;

    static {
        dpjd dpjdVar = new dpjd();
        d = dpjdVar;
        dsqw.cc(dpjd.class, dpjdVar);
    }

    private dpjd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dpjd();
            }
            if (i2 == 4) {
                return new dpjc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpjd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpjd.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
