package defpackage;
/* compiled from: PG */
/* renamed from: dnin  reason: default package */
/* loaded from: classes6.dex */
public final class dnin extends dsqw<dnin, dnim> implements dssk {
    public static final dnin c;
    private static volatile dssr<dnin> e;
    public dgas a;
    public String b = "";
    private int d;

    static {
        dnin dninVar = new dnin();
        c = dninVar;
        dsqw.cc(dnin.class, dninVar);
    }

    private dnin() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dnin();
            }
            if (i2 == 4) {
                return new dnim();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnin> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnin.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
