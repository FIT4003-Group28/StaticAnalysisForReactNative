package defpackage;
/* compiled from: PG */
/* renamed from: dqyv  reason: default package */
/* loaded from: classes6.dex */
public final class dqyv extends dsqw<dqyv, dqyu> implements dssk {
    public static final dqyv a;
    private static volatile dssr<dqyv> b;

    static {
        dqyv dqyvVar = new dqyv();
        a = dqyvVar;
        dsqw.cc(dqyv.class, dqyvVar);
    }

    private dqyv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dqyv();
            }
            if (i2 == 4) {
                return new dqyu();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqyv> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dqyv.class) {
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
