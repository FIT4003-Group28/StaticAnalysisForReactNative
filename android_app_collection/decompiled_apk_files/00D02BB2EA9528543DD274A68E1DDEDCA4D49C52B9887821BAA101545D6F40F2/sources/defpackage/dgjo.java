package defpackage;
/* compiled from: PG */
/* renamed from: dgjo  reason: default package */
/* loaded from: classes6.dex */
public final class dgjo extends dsqw<dgjo, dgjn> implements dssk {
    public static final dgjo f;
    private static volatile dssr<dgjo> h;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    private int g;

    static {
        dgjo dgjoVar = new dgjo();
        f = dgjoVar;
        dsqw.cc(dgjo.class, dgjoVar);
    }

    private dgjo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"g", "a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dgjo();
            }
            if (i2 == 4) {
                return new dgjn();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgjo> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dgjo.class) {
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
