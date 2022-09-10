package defpackage;
/* compiled from: PG */
/* renamed from: dhie  reason: default package */
/* loaded from: classes6.dex */
public final class dhie extends dsqw<dhie, dhid> implements dssk {
    public static final dhie c;
    private static volatile dssr<dhie> d;
    public int a;
    public dhip b;

    static {
        dhie dhieVar = new dhie();
        c = dhieVar;
        dsqw.cc(dhie.class, dhieVar);
    }

    private dhie() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dhie();
            }
            if (i2 == 4) {
                return new dhid();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhie> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhie.class) {
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
