package defpackage;
/* compiled from: PG */
/* renamed from: dlxd  reason: default package */
/* loaded from: classes6.dex */
public final class dlxd extends dsqw<dlxd, dlxc> implements dssk {
    public static final dlxd c;
    private static volatile dssr<dlxd> e;
    public int a = 1;
    public int b;
    private int d;

    static {
        dlxd dlxdVar = new dlxd();
        c = dlxdVar;
        dsqw.cc(dlxd.class, dlxdVar);
    }

    private dlxd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"d", "a", dwfb.a, "b"});
            }
            if (i2 == 3) {
                return new dlxd();
            }
            if (i2 == 4) {
                return new dlxc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlxd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlxd.class) {
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
