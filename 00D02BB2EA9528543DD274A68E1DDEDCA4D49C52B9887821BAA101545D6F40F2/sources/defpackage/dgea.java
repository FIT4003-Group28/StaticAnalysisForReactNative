package defpackage;
/* compiled from: PG */
/* renamed from: dgea  reason: default package */
/* loaded from: classes6.dex */
public final class dgea extends dsqw<dgea, dgdz> implements dssk {
    public static final dgea c;
    private static volatile dssr<dgea> e;
    public String a = "";
    public dgbo b;
    private int d;

    static {
        dgea dgeaVar = new dgea();
        c = dgeaVar;
        dsqw.cc(dgea.class, dgeaVar);
    }

    private dgea() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dgea();
            }
            if (i2 == 4) {
                return new dgdz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgea> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgea.class) {
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
