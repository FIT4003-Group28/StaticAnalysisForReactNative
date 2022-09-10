package defpackage;
/* compiled from: PG */
/* renamed from: chwr  reason: default package */
/* loaded from: classes4.dex */
public final class chwr extends dsqw<chwr, chwq> implements dssk {
    public static final chwr a;
    private static volatile dssr<chwr> b;

    static {
        chwr chwrVar = new chwr();
        a = chwrVar;
        dsqw.cc(chwr.class, chwrVar);
    }

    private chwr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new chwr();
            }
            if (i2 == 4) {
                return new chwq();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chwr> dssrVar = b;
            if (dssrVar == null) {
                synchronized (chwr.class) {
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
