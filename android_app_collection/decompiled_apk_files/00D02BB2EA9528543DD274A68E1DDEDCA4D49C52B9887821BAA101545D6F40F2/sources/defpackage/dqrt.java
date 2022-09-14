package defpackage;
/* compiled from: PG */
/* renamed from: dqrt  reason: default package */
/* loaded from: classes6.dex */
public final class dqrt extends dsqw<dqrt, dqrs> implements dssk {
    public static final dqrt a;
    private static volatile dssr<dqrt> b;

    static {
        dqrt dqrtVar = new dqrt();
        a = dqrtVar;
        dsqw.cc(dqrt.class, dqrtVar);
    }

    private dqrt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dqrt();
            }
            if (i2 == 4) {
                return new dqrs();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqrt> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dqrt.class) {
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
