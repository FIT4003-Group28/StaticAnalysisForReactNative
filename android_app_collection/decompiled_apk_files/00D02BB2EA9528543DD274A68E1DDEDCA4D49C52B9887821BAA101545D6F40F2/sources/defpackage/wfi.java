package defpackage;
/* compiled from: PG */
/* renamed from: wfi  reason: default package */
/* loaded from: classes7.dex */
public final class wfi extends dsqw<wfi, wfh> implements dssk {
    public static final wfi c;
    private static volatile dssr<wfi> d;
    public int a;
    public long b;

    static {
        wfi wfiVar = new wfi();
        c = wfiVar;
        dsqw.cc(wfi.class, wfiVar);
    }

    private wfi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new wfi();
            }
            if (i2 == 4) {
                return new wfh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<wfi> dssrVar = d;
            if (dssrVar == null) {
                synchronized (wfi.class) {
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
