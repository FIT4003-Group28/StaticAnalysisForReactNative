package defpackage;
/* compiled from: PG */
/* renamed from: dwas  reason: default package */
/* loaded from: classes6.dex */
public final class dwas extends dsqw<dwas, dwar> implements dssk {
    public static final dwas d;
    private static volatile dssr<dwas> e;
    public int a;
    public int b;
    public String c = "";

    static {
        dwas dwasVar = new dwas();
        d = dwasVar;
        dsqw.cc(dwas.class, dwasVar);
    }

    private dwas() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dwas();
            }
            if (i2 == 4) {
                return new dwar();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwas> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwas.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
