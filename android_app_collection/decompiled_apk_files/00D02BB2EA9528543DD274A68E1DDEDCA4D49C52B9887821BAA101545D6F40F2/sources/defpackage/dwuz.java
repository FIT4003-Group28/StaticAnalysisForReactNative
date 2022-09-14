package defpackage;
/* compiled from: PG */
/* renamed from: dwuz  reason: default package */
/* loaded from: classes6.dex */
public final class dwuz extends dsqw<dwuz, dwuw> implements dssk {
    public static final dwuz c;
    private static volatile dssr<dwuz> d;
    public int a;
    public dwuy b;

    static {
        dwuz dwuzVar = new dwuz();
        c = dwuzVar;
        dsqw.cc(dwuz.class, dwuzVar);
    }

    private dwuz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဉ\u0002", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dwuz();
            }
            if (i2 == 4) {
                return new dwuw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwuz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwuz.class) {
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
