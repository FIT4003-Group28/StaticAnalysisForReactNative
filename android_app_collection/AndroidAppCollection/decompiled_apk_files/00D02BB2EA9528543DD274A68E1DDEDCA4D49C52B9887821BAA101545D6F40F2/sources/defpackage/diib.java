package defpackage;
/* compiled from: PG */
/* renamed from: diib  reason: default package */
/* loaded from: classes6.dex */
public final class diib extends dsqw<diib, diia> implements dssk {
    public static final diib f;
    private static volatile dssr<diib> g;
    public int a;
    public boolean b;
    public int c;
    public int d;
    public boolean e;

    static {
        diib diibVar = new diib();
        f = diibVar;
        dsqw.cc(diib.class, diibVar);
    }

    private diib() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0005ဇ\u0004", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new diib();
            }
            if (i2 == 4) {
                return new diia();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diib> dssrVar = g;
            if (dssrVar == null) {
                synchronized (diib.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
