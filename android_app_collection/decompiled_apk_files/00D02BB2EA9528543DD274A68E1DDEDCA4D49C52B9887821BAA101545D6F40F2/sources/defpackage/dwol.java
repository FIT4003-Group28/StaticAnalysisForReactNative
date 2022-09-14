package defpackage;
/* compiled from: PG */
/* renamed from: dwol  reason: default package */
/* loaded from: classes.dex */
public final class dwol extends dsqw<dwol, dwok> implements dssk {
    public static final dwol b;
    private static volatile dssr<dwol> c;
    public dsrj<djzk> a = dssu.b;

    static {
        dwol dwolVar = new dwol();
        b = dwolVar;
        dsqw.cc(dwol.class, dwolVar);
    }

    private dwol() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", djzk.class});
            }
            if (i2 == 3) {
                return new dwol();
            }
            if (i2 == 4) {
                return new dwok();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwol> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dwol.class) {
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
