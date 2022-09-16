package defpackage;
/* compiled from: PG */
/* renamed from: akvi  reason: default package */
/* loaded from: classes2.dex */
public final class akvi extends dsqw<akvi, akvh> implements dssk {
    public static final akvi c;
    private static volatile dssr<akvi> d;
    public int a;
    public String b = "";

    static {
        akvi akviVar = new akvi();
        c = akviVar;
        dsqw.cc(akvi.class, akviVar);
    }

    private akvi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new akvi();
            }
            if (i2 == 4) {
                return new akvh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<akvi> dssrVar = d;
            if (dssrVar == null) {
                synchronized (akvi.class) {
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
