package defpackage;
/* compiled from: PG */
/* renamed from: dhkd  reason: default package */
/* loaded from: classes.dex */
public final class dhkd extends dsqw<dhkd, dhkc> implements dssk {
    public static final dhkd d;
    private static volatile dssr<dhkd> e;
    public int a;
    public int b;
    public int c;

    static {
        dhkd dhkdVar = new dhkd();
        d = dhkdVar;
        dsqw.cc(dhkd.class, dhkdVar);
    }

    private dhkd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dhkd();
            }
            if (i2 == 4) {
                return new dhkc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhkd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhkd.class) {
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
