package defpackage;
/* compiled from: PG */
/* renamed from: ddwn  reason: default package */
/* loaded from: classes6.dex */
public final class ddwn extends dsqw<ddwn, ddwl> implements dssk {
    public static final ddwn c;
    private static volatile dssr<ddwn> d;
    public int a;
    public int b;

    static {
        ddwn ddwnVar = new ddwn();
        c = ddwnVar;
        dsqw.cc(ddwn.class, ddwnVar);
    }

    private ddwn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", ddwm.a});
            }
            if (i2 == 3) {
                return new ddwn();
            }
            if (i2 == 4) {
                return new ddwl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddwn> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddwn.class) {
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
