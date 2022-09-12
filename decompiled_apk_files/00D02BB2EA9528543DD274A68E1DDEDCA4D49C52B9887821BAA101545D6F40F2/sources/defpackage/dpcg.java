package defpackage;
/* compiled from: PG */
/* renamed from: dpcg  reason: default package */
/* loaded from: classes6.dex */
public final class dpcg extends dsqw<dpcg, dpcf> implements dssk {
    public static final dpcg a;
    private static volatile dssr<dpcg> b;

    static {
        dpcg dpcgVar = new dpcg();
        a = dpcgVar;
        dsqw.cc(dpcg.class, dpcgVar);
    }

    private dpcg() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dpcg();
            }
            if (i2 == 4) {
                return new dpcf();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpcg> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dpcg.class) {
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
