package defpackage;
/* compiled from: PG */
/* renamed from: daxi  reason: default package */
/* loaded from: classes5.dex */
public final class daxi extends dsqw<daxi, daxh> implements dssk {
    public static final daxi c;
    private static volatile dssr<daxi> e;
    public duhe a;
    public duhe b;
    private int d;

    static {
        daxi daxiVar = new daxi();
        c = daxiVar;
        dsqw.cc(daxi.class, daxiVar);
    }

    private daxi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new daxi();
            }
            if (i2 == 4) {
                return new daxh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<daxi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (daxi.class) {
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
