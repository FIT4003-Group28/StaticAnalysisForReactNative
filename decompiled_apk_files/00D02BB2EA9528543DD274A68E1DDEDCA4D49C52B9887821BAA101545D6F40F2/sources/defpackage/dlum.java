package defpackage;
/* compiled from: PG */
/* renamed from: dlum  reason: default package */
/* loaded from: classes6.dex */
public final class dlum extends dsqw<dlum, dlul> implements dssk {
    public static final dlum a;
    private static volatile dssr<dlum> b;

    static {
        dlum dlumVar = new dlum();
        a = dlumVar;
        dsqw.cc(dlum.class, dlumVar);
    }

    private dlum() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dlum();
            }
            if (i2 == 4) {
                return new dlul();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlum> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dlum.class) {
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
