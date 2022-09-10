package defpackage;
/* compiled from: PG */
/* renamed from: dwxt  reason: default package */
/* loaded from: classes6.dex */
public final class dwxt extends dsqw<dwxt, dwxs> implements dssk {
    public static final dwxt c;
    private static volatile dssr<dwxt> e;
    public dwxx a;
    public dwxr b;
    private int d;

    static {
        dwxt dwxtVar = new dwxt();
        c = dwxtVar;
        dsqw.cc(dwxt.class, dwxtVar);
    }

    private dwxt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dwxt();
            }
            if (i2 == 4) {
                return new dwxs();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwxt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwxt.class) {
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
