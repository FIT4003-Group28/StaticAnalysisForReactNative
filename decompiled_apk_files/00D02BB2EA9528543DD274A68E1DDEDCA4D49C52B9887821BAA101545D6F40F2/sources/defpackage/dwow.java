package defpackage;
/* compiled from: PG */
/* renamed from: dwow  reason: default package */
/* loaded from: classes.dex */
public final class dwow extends dsqw<dwow, dwov> implements dssk {
    public static final dwow c;
    private static volatile dssr<dwow> e;
    public String a = "";
    public float b;
    private int d;

    static {
        dwow dwowVar = new dwow();
        c = dwowVar;
        dsqw.cc(dwow.class, dwowVar);
    }

    private dwow() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dwow();
            }
            if (i2 == 4) {
                return new dwov();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwow> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwow.class) {
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
