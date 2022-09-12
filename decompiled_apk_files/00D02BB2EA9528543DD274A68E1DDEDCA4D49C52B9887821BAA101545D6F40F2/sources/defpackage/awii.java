package defpackage;
/* compiled from: PG */
/* renamed from: awii  reason: default package */
/* loaded from: classes3.dex */
public final class awii extends dsqw<awii, awih> implements dssk {
    public static final awii f;
    private static volatile dssr<awii> g;
    public int a;
    public String b = "";
    public String c = "";
    public long d;
    public long e;

    static {
        awii awiiVar = new awii();
        f = awiiVar;
        dsqw.cc(awii.class, awiiVar);
    }

    private awii() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new awii();
            }
            if (i2 == 4) {
                return new awih();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<awii> dssrVar = g;
            if (dssrVar == null) {
                synchronized (awii.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
