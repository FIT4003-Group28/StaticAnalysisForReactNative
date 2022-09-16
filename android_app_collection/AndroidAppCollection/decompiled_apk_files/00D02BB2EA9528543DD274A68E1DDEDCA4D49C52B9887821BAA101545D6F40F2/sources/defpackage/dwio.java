package defpackage;
/* compiled from: PG */
/* renamed from: dwio  reason: default package */
/* loaded from: classes6.dex */
public final class dwio extends dsqw<dwio, dwin> implements dssk {
    public static final dwio c;
    private static volatile dssr<dwio> d;
    public int a;
    public int b = 1;

    static {
        dwio dwioVar = new dwio();
        c = dwioVar;
        dsqw.cc(dwio.class, dwioVar);
    }

    private dwio() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dwio();
            }
            if (i2 == 4) {
                return new dwin();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwio> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwio.class) {
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
