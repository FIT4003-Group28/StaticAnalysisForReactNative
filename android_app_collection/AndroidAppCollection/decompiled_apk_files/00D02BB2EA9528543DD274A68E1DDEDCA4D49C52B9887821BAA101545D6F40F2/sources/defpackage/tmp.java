package defpackage;
/* compiled from: PG */
/* renamed from: tmp  reason: default package */
/* loaded from: classes7.dex */
public final class tmp extends dsqw<tmp, tmm> implements dssk {
    public static final tmp c;
    private static volatile dssr<tmp> d;
    public int a;
    public int b;

    static {
        tmp tmpVar = new tmp();
        c = tmpVar;
        dsqw.cc(tmp.class, tmpVar);
    }

    private tmp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", tmo.c()});
            }
            if (i2 == 3) {
                return new tmp();
            }
            if (i2 == 4) {
                return new tmm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<tmp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (tmp.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
