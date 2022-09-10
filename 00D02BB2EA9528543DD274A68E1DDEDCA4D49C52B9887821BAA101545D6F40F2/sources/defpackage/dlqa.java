package defpackage;
/* compiled from: PG */
/* renamed from: dlqa  reason: default package */
/* loaded from: classes6.dex */
public final class dlqa extends dsqw<dlqa, dlpz> implements dssk {
    public static final dlqa a;
    private static volatile dssr<dlqa> b;

    static {
        dlqa dlqaVar = new dlqa();
        a = dlqaVar;
        dsqw.cc(dlqa.class, dlqaVar);
    }

    private dlqa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dlqa();
            }
            if (i2 == 4) {
                return new dlpz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlqa> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dlqa.class) {
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
