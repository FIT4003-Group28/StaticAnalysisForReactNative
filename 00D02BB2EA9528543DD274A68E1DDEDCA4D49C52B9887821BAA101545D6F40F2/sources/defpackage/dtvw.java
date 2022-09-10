package defpackage;
/* compiled from: PG */
/* renamed from: dtvw  reason: default package */
/* loaded from: classes6.dex */
public final class dtvw extends dsqw<dtvw, dtvl> implements dssk {
    public static final dtvw b;
    private static volatile dssr<dtvw> c;
    public dtvv a;

    static {
        dtvw dtvwVar = new dtvw();
        b = dtvwVar;
        dsqw.cc(dtvw.class, dtvwVar);
    }

    private dtvw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dtvw();
            }
            if (i2 == 4) {
                return new dtvl();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtvw> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dtvw.class) {
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
