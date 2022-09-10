package defpackage;
/* compiled from: PG */
/* renamed from: cqab  reason: default package */
/* loaded from: classes5.dex */
public final class cqab extends dsqw<cqab, cqaa> implements dssk {
    public static final cqab b;
    private static volatile dssr<cqab> d;
    public int a;
    private int c;

    static {
        cqab cqabVar = new cqab();
        b = cqabVar;
        dsqw.cc(cqab.class, cqabVar);
    }

    private cqab() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", cpxv.a});
            }
            if (i2 == 3) {
                return new cqab();
            }
            if (i2 == 4) {
                return new cqaa();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cqab> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cqab.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
