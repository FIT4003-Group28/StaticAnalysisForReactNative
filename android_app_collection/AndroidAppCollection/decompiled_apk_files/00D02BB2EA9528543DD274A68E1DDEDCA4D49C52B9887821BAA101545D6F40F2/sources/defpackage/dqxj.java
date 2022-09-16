package defpackage;
/* compiled from: PG */
/* renamed from: dqxj  reason: default package */
/* loaded from: classes6.dex */
public final class dqxj extends dsqw<dqxj, dqxi> implements dssk {
    public static final dqxj a;
    private static volatile dssr<dqxj> b;

    static {
        dqxj dqxjVar = new dqxj();
        a = dqxjVar;
        dsqw.cc(dqxj.class, dqxjVar);
    }

    private dqxj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dqxj();
            }
            if (i2 == 4) {
                return new dqxi();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqxj> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dqxj.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
