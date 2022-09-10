package defpackage;
/* compiled from: PG */
/* renamed from: dlqu  reason: default package */
/* loaded from: classes6.dex */
public final class dlqu extends dsqw<dlqu, dlqt> implements dssk {
    public static final dlqu a;
    private static volatile dssr<dlqu> b;

    static {
        dlqu dlquVar = new dlqu();
        a = dlquVar;
        dsqw.cc(dlqu.class, dlquVar);
    }

    private dlqu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dlqu();
            }
            if (i2 == 4) {
                return new dlqt();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlqu> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dlqu.class) {
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
