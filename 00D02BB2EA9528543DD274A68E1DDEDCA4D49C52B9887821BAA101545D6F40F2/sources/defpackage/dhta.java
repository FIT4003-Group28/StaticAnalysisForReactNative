package defpackage;
/* compiled from: PG */
/* renamed from: dhta  reason: default package */
/* loaded from: classes6.dex */
public final class dhta extends dsqw<dhta, dhsz> implements dssk {
    public static final dhta c;
    private static volatile dssr<dhta> d;
    public int a;
    public boolean b;

    static {
        dhta dhtaVar = new dhta();
        c = dhtaVar;
        dsqw.cc(dhta.class, dhtaVar);
    }

    private dhta() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dhta();
            }
            if (i2 == 4) {
                return new dhsz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhta> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhta.class) {
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
