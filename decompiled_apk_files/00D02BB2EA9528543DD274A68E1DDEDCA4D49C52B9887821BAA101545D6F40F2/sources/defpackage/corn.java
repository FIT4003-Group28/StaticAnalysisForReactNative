package defpackage;
/* compiled from: PG */
/* renamed from: corn  reason: default package */
/* loaded from: classes5.dex */
public final class corn extends dsqw<corn, corm> implements dssk {
    public static final corn a;
    private static volatile dssr<corn> b;

    static {
        corn cornVar = new corn();
        a = cornVar;
        dsqw.cc(corn.class, cornVar);
    }

    private corn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new corn();
            }
            if (i2 == 4) {
                return new corm();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<corn> dssrVar = b;
            if (dssrVar == null) {
                synchronized (corn.class) {
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
