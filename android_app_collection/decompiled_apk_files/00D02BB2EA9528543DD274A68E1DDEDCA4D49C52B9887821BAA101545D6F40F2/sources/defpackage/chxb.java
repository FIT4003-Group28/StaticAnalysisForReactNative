package defpackage;
/* compiled from: PG */
/* renamed from: chxb  reason: default package */
/* loaded from: classes4.dex */
public final class chxb extends dsqw<chxb, chxa> implements dssk {
    public static final chxb c;
    private static volatile dssr<chxb> d;
    public int a;
    public String b = "";

    static {
        chxb chxbVar = new chxb();
        c = chxbVar;
        dsqw.cc(chxb.class, chxbVar);
    }

    private chxb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new chxb();
            }
            if (i2 == 4) {
                return new chxa();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chxb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (chxb.class) {
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
