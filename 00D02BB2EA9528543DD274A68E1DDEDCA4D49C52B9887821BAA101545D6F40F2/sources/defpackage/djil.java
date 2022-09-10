package defpackage;
/* compiled from: PG */
/* renamed from: djil  reason: default package */
/* loaded from: classes6.dex */
public final class djil extends dsqw<djil, djik> implements dssk {
    public static final djil c;
    private static volatile dssr<djil> e;
    public int a;
    public int b;
    private int d;

    static {
        djil djilVar = new djil();
        c = djilVar;
        dsqw.cc(djil.class, djilVar);
    }

    private djil() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new djil();
            }
            if (i2 == 4) {
                return new djik();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djil> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djil.class) {
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
