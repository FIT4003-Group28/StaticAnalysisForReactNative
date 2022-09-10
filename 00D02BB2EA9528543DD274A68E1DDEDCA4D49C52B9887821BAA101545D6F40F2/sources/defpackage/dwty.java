package defpackage;
/* compiled from: PG */
/* renamed from: dwty  reason: default package */
/* loaded from: classes6.dex */
public final class dwty extends dsqw<dwty, dwtv> implements dssk {
    public static final dwty c;
    private static volatile dssr<dwty> e;
    public dwtx a;
    public dinw b;
    private int d;

    static {
        dwty dwtyVar = new dwty();
        c = dwtyVar;
        dsqw.cc(dwty.class, dwtyVar);
    }

    private dwty() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dwty();
            }
            if (i2 == 4) {
                return new dwtv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwty> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwty.class) {
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
