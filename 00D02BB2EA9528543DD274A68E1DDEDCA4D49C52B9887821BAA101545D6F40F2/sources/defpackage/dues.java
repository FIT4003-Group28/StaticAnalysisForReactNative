package defpackage;
/* compiled from: PG */
/* renamed from: dues  reason: default package */
/* loaded from: classes6.dex */
public final class dues extends dsqw<dues, duen> implements dssk {
    public static final dues d;
    private static volatile dssr<dues> f;
    public dufm a;
    public duer b;
    public String c = "";
    private int e;

    static {
        dues duesVar = new dues();
        d = duesVar;
        dsqw.cc(dues.class, duesVar);
    }

    private dues() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dues();
            }
            if (i2 == 4) {
                return new duen();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dues> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dues.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
