package defpackage;
/* compiled from: PG */
/* renamed from: duyu  reason: default package */
/* loaded from: classes6.dex */
public final class duyu extends dsqw<duyu, duyt> implements dssk {
    public static final duyu c;
    private static volatile dssr<duyu> d;
    public int a;
    public boolean b;

    static {
        duyu duyuVar = new duyu();
        c = duyuVar;
        dsqw.cc(duyu.class, duyuVar);
    }

    private duyu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new duyu();
            }
            if (i2 == 4) {
                return new duyt();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duyu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (duyu.class) {
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
