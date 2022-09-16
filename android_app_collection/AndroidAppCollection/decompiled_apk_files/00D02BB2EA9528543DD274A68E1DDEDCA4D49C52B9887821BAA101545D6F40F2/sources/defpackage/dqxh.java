package defpackage;
/* compiled from: PG */
/* renamed from: dqxh  reason: default package */
/* loaded from: classes6.dex */
public final class dqxh extends dsqw<dqxh, dqxg> implements dssk {
    public static final dqxh a;
    private static volatile dssr<dqxh> b;

    static {
        dqxh dqxhVar = new dqxh();
        a = dqxhVar;
        dsqw.cc(dqxh.class, dqxhVar);
    }

    private dqxh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dqxh();
            }
            if (i2 == 4) {
                return new dqxg();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqxh> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dqxh.class) {
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
