package defpackage;
/* compiled from: PG */
/* renamed from: dhyo  reason: default package */
/* loaded from: classes6.dex */
public final class dhyo extends dsqw<dhyo, dhyn> implements dssk {
    public static final dhyo b;
    private static volatile dssr<dhyo> d;
    public String a = "";
    private int c;

    static {
        dhyo dhyoVar = new dhyo();
        b = dhyoVar;
        dsqw.cc(dhyo.class, dhyoVar);
    }

    private dhyo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dhyo();
            }
            if (i2 == 4) {
                return new dhyn();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhyo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhyo.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
