package defpackage;
/* compiled from: PG */
/* renamed from: dqgj  reason: default package */
/* loaded from: classes6.dex */
public final class dqgj extends dsqw<dqgj, dqgi> implements dssk {
    public static final dqgj a;
    private static volatile dssr<dqgj> b;

    static {
        dqgj dqgjVar = new dqgj();
        a = dqgjVar;
        dsqw.cc(dqgj.class, dqgjVar);
    }

    private dqgj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dqgj();
            }
            if (i2 == 4) {
                return new dqgi();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqgj> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dqgj.class) {
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
