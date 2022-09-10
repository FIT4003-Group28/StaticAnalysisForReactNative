package defpackage;
/* compiled from: PG */
/* renamed from: djno  reason: default package */
/* loaded from: classes6.dex */
public final class djno extends dsqw<djno, djnn> implements dssk {
    public static final djno a;
    private static volatile dssr<djno> b;

    static {
        djno djnoVar = new djno();
        a = djnoVar;
        dsqw.cc(djno.class, djnoVar);
    }

    private djno() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djno();
            }
            if (i2 == 4) {
                return new djnn();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djno> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djno.class) {
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
