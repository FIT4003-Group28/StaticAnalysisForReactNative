package defpackage;
/* compiled from: PG */
/* renamed from: dsqy  reason: default package */
/* loaded from: classes6.dex */
public final class dsqy extends dsqw<dsqy, dsqx> implements dssk {
    public static final dsqy b;
    private static volatile dssr<dsqy> c;
    public int a;

    static {
        dsqy dsqyVar = new dsqy();
        b = dsqyVar;
        dsqw.cc(dsqy.class, dsqyVar);
    }

    private dsqy() {
    }

    public static dsqy c(int i) {
        dsqx bZ = b.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dsqy) bZ.b).a = i;
        return bZ.bK();
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dsqy();
            }
            if (i2 == 4) {
                return new dsqx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsqy> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dsqy.class) {
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
