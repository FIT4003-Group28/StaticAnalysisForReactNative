package defpackage;
/* compiled from: PG */
/* renamed from: dgxz  reason: default package */
/* loaded from: classes6.dex */
public final class dgxz extends dsqw<dgxz, dgxy> implements dssk {
    public static final dgxz e;
    private static volatile dssr<dgxz> f;
    public int a;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        dgxz dgxzVar = new dgxz();
        e = dgxzVar;
        dsqw.cc(dgxz.class, dgxzVar);
    }

    private dgxz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ဈ\u0001", new Object[]{"c", "b", "a", dgyl.class, "d"});
            }
            if (i2 == 3) {
                return new dgxz();
            }
            if (i2 == 4) {
                return new dgxy();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgxz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dgxz.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
