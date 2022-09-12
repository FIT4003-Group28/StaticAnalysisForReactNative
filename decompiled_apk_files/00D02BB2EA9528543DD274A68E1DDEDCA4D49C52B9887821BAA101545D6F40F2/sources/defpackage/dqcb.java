package defpackage;
/* compiled from: PG */
/* renamed from: dqcb  reason: default package */
/* loaded from: classes6.dex */
public final class dqcb extends dsqw<dqcb, dqca> implements dssk {
    public static final dqcb a;
    private static volatile dssr<dqcb> b;

    static {
        dqcb dqcbVar = new dqcb();
        a = dqcbVar;
        dsqw.cc(dqcb.class, dqcbVar);
    }

    private dqcb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dqcb();
            }
            if (i2 == 4) {
                return new dqca();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqcb> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dqcb.class) {
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
