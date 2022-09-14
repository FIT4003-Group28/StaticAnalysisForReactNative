package defpackage;
/* compiled from: PG */
/* renamed from: dwdv  reason: default package */
/* loaded from: classes.dex */
public final class dwdv extends dsqw<dwdv, dwdu> implements dssk {
    public static final dwdv a;
    private static volatile dssr<dwdv> d;
    private int b;
    private boolean c;

    static {
        dwdv dwdvVar = new dwdv();
        a = dwdvVar;
        dsqw.cc(dwdv.class, dwdvVar);
    }

    private dwdv() {
    }

    public static /* synthetic */ void c(dwdv dwdvVar) {
        dwdvVar.b |= 1;
        dwdvVar.c = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dwdv();
            }
            if (i2 == 4) {
                return new dwdu();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwdv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwdv.class) {
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
