package defpackage;
/* compiled from: PG */
/* renamed from: duza  reason: default package */
/* loaded from: classes6.dex */
public final class duza extends dsqw<duza, duyz> implements dssk {
    public static final duza c;
    private static volatile dssr<duza> d;
    public int a;
    public int b;

    static {
        duza duzaVar = new duza();
        c = duzaVar;
        dsqw.cc(duza.class, duzaVar);
    }

    private duza() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dqkk.a});
            }
            if (i2 == 3) {
                return new duza();
            }
            if (i2 == 4) {
                return new duyz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duza> dssrVar = d;
            if (dssrVar == null) {
                synchronized (duza.class) {
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
