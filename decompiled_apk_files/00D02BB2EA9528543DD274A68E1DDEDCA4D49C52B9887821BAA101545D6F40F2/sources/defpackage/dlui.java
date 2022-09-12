package defpackage;
/* compiled from: PG */
/* renamed from: dlui  reason: default package */
/* loaded from: classes6.dex */
public final class dlui extends dsqw<dlui, dluh> implements dssk {
    public static final dlui a;
    private static volatile dssr<dlui> b;

    static {
        dlui dluiVar = new dlui();
        a = dluiVar;
        dsqw.cc(dlui.class, dluiVar);
    }

    private dlui() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dlui();
            }
            if (i2 == 4) {
                return new dluh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlui> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dlui.class) {
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
