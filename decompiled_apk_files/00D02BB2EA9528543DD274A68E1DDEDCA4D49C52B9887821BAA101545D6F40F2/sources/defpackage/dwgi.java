package defpackage;
/* compiled from: PG */
/* renamed from: dwgi  reason: default package */
/* loaded from: classes6.dex */
public final class dwgi extends dsqw<dwgi, dwgh> implements dssk {
    public static final dwgi b;
    private static volatile dssr<dwgi> c;
    public dsrj<dweu> a = dssu.b;

    static {
        dwgi dwgiVar = new dwgi();
        b = dwgiVar;
        dsqw.cc(dwgi.class, dwgiVar);
    }

    private dwgi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dweu.class});
            }
            if (i2 == 3) {
                return new dwgi();
            }
            if (i2 == 4) {
                return new dwgh();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwgi> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dwgi.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
