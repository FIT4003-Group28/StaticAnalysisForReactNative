package defpackage;
/* compiled from: PG */
/* renamed from: ddre  reason: default package */
/* loaded from: classes6.dex */
public final class ddre extends dsqw<ddre, ddrd> implements dssk {
    public static final ddre a;
    private static volatile dssr<ddre> d;
    private int b;
    private boolean c;

    static {
        ddre ddreVar = new ddre();
        a = ddreVar;
        dsqw.cc(ddre.class, ddreVar);
    }

    private ddre() {
    }

    public static /* synthetic */ void b(ddre ddreVar) {
        ddreVar.b |= 1;
        ddreVar.c = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new ddre();
            }
            if (i2 == 4) {
                return new ddrd();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddre> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddre.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
