package defpackage;
/* compiled from: PG */
/* renamed from: cyjy  reason: default package */
/* loaded from: classes5.dex */
public final class cyjy extends dsqw<cyjy, cyjx> implements dssk {
    public static final cyjy b;
    private static volatile dssr<cyjy> c;
    public cylo a;

    static {
        cyjy cyjyVar = new cyjy();
        b = cyjyVar;
        dsqw.cc(cyjy.class, cyjyVar);
    }

    private cyjy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new cyjy();
            }
            if (i2 == 4) {
                return new cyjx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cyjy> dssrVar = c;
            if (dssrVar == null) {
                synchronized (cyjy.class) {
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
