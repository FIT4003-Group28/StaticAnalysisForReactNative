package defpackage;
/* compiled from: PG */
/* renamed from: chhx  reason: default package */
/* loaded from: classes4.dex */
public final class chhx extends dsqw<chhx, chhw> implements dssk {
    public static final chhx c;
    private static volatile dssr<chhx> d;
    public int a;
    public boolean b;

    static {
        chhx chhxVar = new chhx();
        c = chhxVar;
        dsqw.cc(chhx.class, chhxVar);
    }

    private chhx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new chhx();
            }
            if (i2 == 4) {
                return new chhw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chhx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (chhx.class) {
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
