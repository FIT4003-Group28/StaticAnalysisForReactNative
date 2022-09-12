package defpackage;
/* compiled from: PG */
/* renamed from: dwpj  reason: default package */
/* loaded from: classes6.dex */
public final class dwpj extends dsqw<dwpj, dwpi> implements dssk {
    public static final dwpj c;
    private static volatile dssr<dwpj> d;
    public int a = 0;
    public Object b;

    static {
        dwpj dwpjVar = new dwpj();
        c = dwpjVar;
        dsqw.cc(dwpj.class, dwpjVar);
    }

    private dwpj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001်\u0000", new Object[]{"b", "a"});
            }
            if (i2 == 3) {
                return new dwpj();
            }
            if (i2 == 4) {
                return new dwpi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwpj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwpj.class) {
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
