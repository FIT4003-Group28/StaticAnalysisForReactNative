package defpackage;
/* compiled from: PG */
/* renamed from: dnfd  reason: default package */
/* loaded from: classes6.dex */
public final class dnfd extends dsqw<dnfd, dnfc> implements dssk {
    public static final dnfd d;
    private static volatile dssr<dnfd> e;
    public int a;
    public String b = "";
    public dglu c;

    static {
        dnfd dnfdVar = new dnfd();
        d = dnfdVar;
        dsqw.cc(dnfd.class, dnfdVar);
    }

    private dnfd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dnfd();
            }
            if (i2 == 4) {
                return new dnfc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnfd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnfd.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
