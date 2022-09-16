package defpackage;
/* compiled from: PG */
/* renamed from: dwnn */
/* loaded from: classes6.dex */
public final class dwnn extends dsqw<dwnn, dwnm> implements dssk {
    public static final dwnn b;
    private static volatile dssr<dwnn> e;
    public dsri a = dsrx.b;
    private int c;
    private boolean d;

    static {
        dwnn dwnnVar = new dwnn();
        b = dwnnVar;
        dsqw.cc(dwnn.class, dwnnVar);
    }

    private dwnn() {
    }

    public static /* synthetic */ void c(dwnn dwnnVar) {
        dwnnVar.c |= 1;
        dwnnVar.d = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0017\u0002ဇ\u0000", new Object[]{"c", "a", "d"});
            }
            if (i2 == 3) {
                return new dwnn();
            }
            if (i2 == 4) {
                return new dwnm();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwnn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwnn.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
