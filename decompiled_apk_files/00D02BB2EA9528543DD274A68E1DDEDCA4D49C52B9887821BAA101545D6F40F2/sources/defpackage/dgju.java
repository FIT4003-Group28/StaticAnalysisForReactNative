package defpackage;
/* compiled from: PG */
/* renamed from: dgju  reason: default package */
/* loaded from: classes6.dex */
public final class dgju extends dsqw<dgju, dgjt> implements dssk {
    public static final dgju c;
    private static volatile dssr<dgju> e;
    public dspd a = dspd.b;
    public dspd b = dspd.b;
    private int d;

    static {
        dgju dgjuVar = new dgju();
        c = dgjuVar;
        dsqw.cc(dgju.class, dgjuVar);
    }

    private dgju() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ည\u0001\u0003ည\u0000", new Object[]{"d", "b", "a"});
            }
            if (i2 == 3) {
                return new dgju();
            }
            if (i2 == 4) {
                return new dgjt();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgju> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgju.class) {
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
