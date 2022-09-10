package defpackage;
/* compiled from: PG */
/* renamed from: dgyt  reason: default package */
/* loaded from: classes6.dex */
public final class dgyt extends dsqw<dgyt, dgyr> implements dssk {
    public static final dgyt h;
    private static volatile dssr<dgyt> i;
    public int a;
    public int b;
    public int c;
    public int d;
    public dstv e;
    public dstv f;
    public int g;

    static {
        dgyt dgytVar = new dgyt();
        h = dgytVar;
        dsqw.cc(dgyt.class, dgytVar);
    }

    private dgyt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\f\u0005\t\u0006\t\u0007\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new dgyt();
            }
            if (i3 == 4) {
                return new dgyr();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dgyt> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dgyt.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
