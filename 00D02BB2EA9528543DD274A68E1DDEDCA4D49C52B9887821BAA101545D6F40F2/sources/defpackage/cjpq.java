package defpackage;
/* compiled from: PG */
/* renamed from: cjpq  reason: default package */
/* loaded from: classes4.dex */
public final class cjpq extends dsqw<cjpq, cjpn> implements dssk {
    public static final cjpq c;
    private static volatile dssr<cjpq> d;
    public int a;
    public int b;

    static {
        cjpq cjpqVar = new cjpq();
        c = cjpqVar;
        dsqw.cc(cjpq.class, cjpqVar);
    }

    private cjpq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", cjpp.c()});
            }
            if (i2 == 3) {
                return new cjpq();
            }
            if (i2 == 4) {
                return new cjpn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cjpq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cjpq.class) {
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
