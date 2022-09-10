package defpackage;
/* compiled from: PG */
/* renamed from: djea  reason: default package */
/* loaded from: classes6.dex */
public final class djea extends dsqw<djea, djdz> implements dssk {
    public static final djea c;
    private static volatile dssr<djea> d;
    public int a;
    public int b;

    static {
        djea djeaVar = new djea();
        c = djeaVar;
        dsqw.cc(djea.class, djeaVar);
    }

    private djea() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dkcp.c()});
            }
            if (i2 == 3) {
                return new djea();
            }
            if (i2 == 4) {
                return new djdz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djea> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djea.class) {
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
