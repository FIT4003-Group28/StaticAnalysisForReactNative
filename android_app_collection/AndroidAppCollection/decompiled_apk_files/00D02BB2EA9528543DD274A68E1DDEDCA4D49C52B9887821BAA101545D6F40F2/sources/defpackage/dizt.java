package defpackage;
/* compiled from: PG */
/* renamed from: dizt  reason: default package */
/* loaded from: classes6.dex */
public final class dizt extends dsqw<dizt, dizs> implements dssk {
    public static final dizt a;
    private static volatile dssr<dizt> b;

    static {
        dizt diztVar = new dizt();
        a = diztVar;
        dsqw.cc(dizt.class, diztVar);
    }

    private dizt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dizt();
            }
            if (i2 == 4) {
                return new dizs();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dizt> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dizt.class) {
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
