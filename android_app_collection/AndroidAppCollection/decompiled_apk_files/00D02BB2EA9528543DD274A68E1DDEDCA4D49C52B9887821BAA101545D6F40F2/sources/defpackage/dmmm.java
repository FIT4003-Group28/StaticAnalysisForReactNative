package defpackage;
/* compiled from: PG */
/* renamed from: dmmm  reason: default package */
/* loaded from: classes.dex */
public final class dmmm extends dsqw<dmmm, dmml> implements dssk {
    public static final dmmm b;
    private static volatile dssr<dmmm> c;
    public dsrf a = dsqz.b;

    static {
        dmmm dmmmVar = new dmmm();
        b = dmmmVar;
        dsqw.cc(dmmm.class, dmmmVar);
    }

    private dmmm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dmmm();
            }
            if (i2 == 4) {
                return new dmml();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmmm> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dmmm.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
