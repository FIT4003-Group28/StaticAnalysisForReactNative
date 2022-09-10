package defpackage;
/* compiled from: PG */
/* renamed from: cpzn  reason: default package */
/* loaded from: classes5.dex */
public final class cpzn extends dsqw<cpzn, cpzm> implements dssk {
    public static final cpzn c;
    private static volatile dssr<cpzn> d;
    public int a;
    public long b;

    static {
        cpzn cpznVar = new cpzn();
        c = cpznVar;
        dsqw.cc(cpzn.class, cpznVar);
    }

    private cpzn() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဂ\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new cpzn();
            }
            if (i2 == 4) {
                return new cpzm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cpzn> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cpzn.class) {
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
