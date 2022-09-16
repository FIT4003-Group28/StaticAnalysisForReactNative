package defpackage;
/* compiled from: PG */
/* renamed from: dorw  reason: default package */
/* loaded from: classes6.dex */
public final class dorw extends dsqw<dorw, dorv> implements dssk {
    public static final dorw d;
    private static volatile dssr<dorw> f;
    public int a;
    public String b = "";
    public int c;
    private boolean e;

    static {
        dorw dorwVar = new dorw();
        d = dorwVar;
        dsqw.cc(dorw.class, dorwVar);
    }

    private dorw() {
    }

    public static /* synthetic */ void b(dorw dorwVar) {
        dorwVar.a |= 2;
        dorwVar.e = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0001\u0002င\u0002\u0003ဈ\u0000", new Object[]{"a", "e", "c", "b"});
            }
            if (i2 == 3) {
                return new dorw();
            }
            if (i2 == 4) {
                return new dorv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dorw> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dorw.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
