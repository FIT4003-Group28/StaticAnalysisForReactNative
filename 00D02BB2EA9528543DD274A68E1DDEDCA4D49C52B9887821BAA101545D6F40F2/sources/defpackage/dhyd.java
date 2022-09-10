package defpackage;
/* compiled from: PG */
/* renamed from: dhyd  reason: default package */
/* loaded from: classes6.dex */
public final class dhyd extends dsqw<dhyd, dhyc> implements dssk {
    public static final dhyd f;
    private static volatile dssr<dhyd> h;
    public int a;
    public dhxz d;
    public dmni e;
    private byte g = 2;
    public String b = "";
    public int c = 1;

    static {
        dhyd dhydVar = new dhyd();
        f = dhydVar;
        dsqw.cc(dhyd.class, dhydVar);
    }

    private dhyd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003", new Object[]{"a", "b", "c", dpuk.c(), "d", "e"});
            }
            if (i2 == 3) {
                return new dhyd();
            }
            if (i2 == 4) {
                return new dhyc();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dhyd> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dhyd.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
