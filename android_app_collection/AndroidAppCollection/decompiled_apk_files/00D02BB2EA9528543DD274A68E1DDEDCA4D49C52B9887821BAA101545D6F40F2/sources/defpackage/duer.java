package defpackage;
/* compiled from: PG */
/* renamed from: duer  reason: default package */
/* loaded from: classes6.dex */
public final class duer extends dsqw<duer, dueo> implements dssk {
    public static final duer c;
    private static volatile dssr<duer> e;
    public long a;
    public int b;
    private int d;

    static {
        duer duerVar = new duer();
        c = duerVar;
        dsqw.cc(duer.class, duerVar);
    }

    private duer() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", duep.a});
            }
            if (i2 == 3) {
                return new duer();
            }
            if (i2 == 4) {
                return new dueo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duer> dssrVar = e;
            if (dssrVar == null) {
                synchronized (duer.class) {
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
