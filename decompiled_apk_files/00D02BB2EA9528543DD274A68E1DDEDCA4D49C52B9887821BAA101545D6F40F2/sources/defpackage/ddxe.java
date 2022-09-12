package defpackage;
/* compiled from: PG */
/* renamed from: ddxe  reason: default package */
/* loaded from: classes6.dex */
public final class ddxe extends dsqw<ddxe, ddxd> implements dssk {
    public static final ddxe f;
    private static volatile dssr<ddxe> g;
    public int a;
    public dspt b;
    public int c;
    public int d;
    public int e;

    static {
        ddxe ddxeVar = new ddxe();
        f = ddxeVar;
        dsqw.cc(ddxe.class, ddxeVar);
    }

    private ddxe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new ddxe();
            }
            if (i2 == 4) {
                return new ddxd();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddxe> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ddxe.class) {
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
