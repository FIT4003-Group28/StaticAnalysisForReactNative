package defpackage;
/* compiled from: PG */
/* renamed from: duno  reason: default package */
/* loaded from: classes.dex */
public final class duno extends dsqw<duno, dunn> implements dssk {
    public static final duno f;
    private static volatile dssr<duno> h;
    public boolean a;
    public int b = 1209600;
    public int c = 3;
    public int d = 1209600;
    public int e = 3;
    private int g;

    static {
        duno dunoVar = new duno();
        f = dunoVar;
        dsqw.cc(duno.class, dunoVar);
    }

    private duno() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"g", "a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new duno();
            }
            if (i2 == 4) {
                return new dunn();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duno> dssrVar = h;
            if (dssrVar == null) {
                synchronized (duno.class) {
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
