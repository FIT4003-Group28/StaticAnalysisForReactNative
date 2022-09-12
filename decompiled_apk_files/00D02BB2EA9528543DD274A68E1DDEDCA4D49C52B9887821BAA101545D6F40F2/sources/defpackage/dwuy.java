package defpackage;
/* compiled from: PG */
/* renamed from: dwuy  reason: default package */
/* loaded from: classes6.dex */
public final class dwuy extends dsqw<dwuy, dwux> implements dssk {
    public static final dwuy c;
    private static volatile dssr<dwuy> e;
    public boolean a;
    public dsrj<dpxu> b = dssu.b;
    private int d;

    static {
        dwuy dwuyVar = new dwuy();
        c = dwuyVar;
        dsqw.cc(dwuy.class, dwuyVar);
    }

    private dwuy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001b", new Object[]{"d", "a", "b", dpxu.class});
            }
            if (i2 == 3) {
                return new dwuy();
            }
            if (i2 == 4) {
                return new dwux();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwuy> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwuy.class) {
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
