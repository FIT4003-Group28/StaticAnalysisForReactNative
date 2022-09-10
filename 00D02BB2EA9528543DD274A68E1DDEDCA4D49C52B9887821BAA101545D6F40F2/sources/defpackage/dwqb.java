package defpackage;
/* compiled from: PG */
/* renamed from: dwqb  reason: default package */
/* loaded from: classes6.dex */
public final class dwqb extends dsqw<dwqb, dwqa> implements dssk {
    public static final dwqb b;
    private static volatile dssr<dwqb> d;
    public String a = "";
    private int c;

    static {
        dwqb dwqbVar = new dwqb();
        b = dwqbVar;
        dsqw.cc(dwqb.class, dwqbVar);
    }

    private dwqb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dwqb();
            }
            if (i2 == 4) {
                return new dwqa();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwqb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwqb.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
