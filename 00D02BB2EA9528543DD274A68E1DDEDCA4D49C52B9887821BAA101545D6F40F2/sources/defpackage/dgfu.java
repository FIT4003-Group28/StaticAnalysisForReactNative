package defpackage;
/* compiled from: PG */
/* renamed from: dgfu  reason: default package */
/* loaded from: classes6.dex */
public final class dgfu extends dsqw<dgfu, dgft> implements dssk {
    public static final dgfu c;
    private static volatile dssr<dgfu> e;
    public String a = "";
    public int b;
    private int d;

    static {
        dgfu dgfuVar = new dgfu();
        c = dgfuVar;
        dsqw.cc(dgfu.class, dgfuVar);
    }

    private dgfu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"d", "a", "b", dgfv.a});
            }
            if (i2 == 3) {
                return new dgfu();
            }
            if (i2 == 4) {
                return new dgft();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgfu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgfu.class) {
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
