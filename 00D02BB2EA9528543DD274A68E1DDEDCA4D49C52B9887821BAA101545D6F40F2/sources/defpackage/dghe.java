package defpackage;
/* compiled from: PG */
/* renamed from: dghe  reason: default package */
/* loaded from: classes.dex */
public final class dghe extends dsqw<dghe, dghd> implements dssk {
    public static final dghe c;
    private static volatile dssr<dghe> e;
    public dhkd a;
    public dhkd b;
    private int d;

    static {
        dghe dgheVar = new dghe();
        c = dgheVar;
        dsqw.cc(dghe.class, dgheVar);
    }

    private dghe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dghe();
            }
            if (i2 == 4) {
                return new dghd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dghe> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dghe.class) {
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
