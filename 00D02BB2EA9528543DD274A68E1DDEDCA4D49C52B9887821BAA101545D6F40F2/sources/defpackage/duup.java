package defpackage;
/* compiled from: PG */
/* renamed from: duup  reason: default package */
/* loaded from: classes.dex */
public final class duup extends dsqw<duup, duum> implements dssk {
    public static final duup c;
    private static volatile dssr<duup> e;
    public boolean a;
    public int b = 1;
    private int d;

    static {
        duup duupVar = new duup();
        c = duupVar;
        dsqw.cc(duup.class, duupVar);
    }

    private duup() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", duun.a});
            }
            if (i2 == 3) {
                return new duup();
            }
            if (i2 == 4) {
                return new duum();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duup> dssrVar = e;
            if (dssrVar == null) {
                synchronized (duup.class) {
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
