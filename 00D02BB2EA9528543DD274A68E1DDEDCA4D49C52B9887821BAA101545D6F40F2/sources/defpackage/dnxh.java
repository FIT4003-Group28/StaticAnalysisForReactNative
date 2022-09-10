package defpackage;
/* compiled from: PG */
/* renamed from: dnxh  reason: default package */
/* loaded from: classes6.dex */
public final class dnxh extends dsqw<dnxh, dnxg> implements dssk {
    public static final dnxh c;
    private static volatile dssr<dnxh> e;
    public String a = "";
    public dnwr b;
    private int d;

    static {
        dnxh dnxhVar = new dnxh();
        c = dnxhVar;
        dsqw.cc(dnxh.class, dnxhVar);
    }

    private dnxh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dnxh();
            }
            if (i2 == 4) {
                return new dnxg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnxh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnxh.class) {
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
