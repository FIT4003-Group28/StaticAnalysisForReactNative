package defpackage;
/* compiled from: PG */
/* renamed from: amyr  reason: default package */
/* loaded from: classes2.dex */
public final class amyr extends dsqw<amyr, amyq> implements dssk {
    public static final amyr f;
    private static volatile dssr<amyr> h;
    public String a = "";
    public int b;
    public int c;
    public int d;
    public int e;
    private int g;

    static {
        amyr amyrVar = new amyr();
        f = amyrVar;
        dsqw.cc(amyr.class, amyrVar);
    }

    private amyr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"g", "a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new amyr();
            }
            if (i2 == 4) {
                return new amyq();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<amyr> dssrVar = h;
            if (dssrVar == null) {
                synchronized (amyr.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
