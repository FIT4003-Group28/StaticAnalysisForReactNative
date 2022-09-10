package defpackage;
/* compiled from: PG */
/* renamed from: diql  reason: default package */
/* loaded from: classes6.dex */
public final class diql extends dsqw<diql, diqk> implements dssk {
    public static final diql a;
    private static volatile dssr<diql> b;

    static {
        diql diqlVar = new diql();
        a = diqlVar;
        dsqw.cc(diql.class, diqlVar);
    }

    private diql() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new diql();
            }
            if (i2 == 4) {
                return new diqk();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diql> dssrVar = b;
            if (dssrVar == null) {
                synchronized (diql.class) {
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
