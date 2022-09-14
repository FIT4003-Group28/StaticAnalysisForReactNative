package defpackage;
/* compiled from: PG */
/* renamed from: dhij  reason: default package */
/* loaded from: classes6.dex */
public final class dhij extends dsqw<dhij, dhii> implements dssk {
    public static final dhij c;
    private static volatile dssr<dhij> e;
    public int a;
    public int b;
    private int d;

    static {
        dhij dhijVar = new dhij();
        c = dhijVar;
        dsqw.cc(dhij.class, dhijVar);
    }

    private dhij() {
    }

    public static /* synthetic */ void b(dhij dhijVar) {
        dhijVar.a |= 2;
        dhijVar.d = 341506552;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", dgyd.c(), "d"});
            }
            if (i2 == 3) {
                return new dhij();
            }
            if (i2 == 4) {
                return new dhii();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhij> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhij.class) {
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
