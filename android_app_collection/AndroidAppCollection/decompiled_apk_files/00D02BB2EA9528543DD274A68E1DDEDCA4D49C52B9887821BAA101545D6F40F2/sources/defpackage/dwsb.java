package defpackage;
/* compiled from: PG */
/* renamed from: dwsb  reason: default package */
/* loaded from: classes6.dex */
public final class dwsb extends dsqw<dwsb, dwsa> implements dssk {
    public static final dwsb c;
    private static volatile dssr<dwsb> d;
    public int a;
    public dhjx b;

    static {
        dwsb dwsbVar = new dwsb();
        c = dwsbVar;
        dsqw.cc(dwsb.class, dwsbVar);
    }

    private dwsb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dwsb();
            }
            if (i2 == 4) {
                return new dwsa();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwsb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwsb.class) {
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
