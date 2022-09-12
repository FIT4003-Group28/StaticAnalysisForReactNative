package defpackage;
/* compiled from: PG */
/* renamed from: dkyj  reason: default package */
/* loaded from: classes.dex */
public final class dkyj extends dsqw<dkyj, dkyi> implements dssk {
    public static final dkyj b;
    private static volatile dssr<dkyj> d;
    public int a = 14;
    private int c;

    static {
        dkyj dkyjVar = new dkyj();
        b = dkyjVar;
        dsqw.cc(dkyj.class, dkyjVar);
    }

    private dkyj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0001", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dkyj();
            }
            if (i2 == 4) {
                return new dkyi();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkyj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkyj.class) {
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
