package defpackage;
/* compiled from: PG */
/* renamed from: dito  reason: default package */
/* loaded from: classes6.dex */
public final class dito extends dsqw<dito, ditn> implements dssk {
    public static final dito b;
    private static volatile dssr<dito> d;
    public dqzl a;
    private int c;

    static {
        dito ditoVar = new dito();
        b = ditoVar;
        dsqw.cc(dito.class, ditoVar);
    }

    private dito() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dito();
            }
            if (i2 == 4) {
                return new ditn();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dito> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dito.class) {
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
