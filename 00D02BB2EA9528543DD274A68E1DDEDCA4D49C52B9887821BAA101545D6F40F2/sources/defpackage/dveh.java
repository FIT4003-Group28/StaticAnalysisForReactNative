package defpackage;
/* compiled from: PG */
/* renamed from: dveh  reason: default package */
/* loaded from: classes.dex */
public final class dveh extends dsqw<dveh, dvee> implements dssk {
    public static final dveh f;
    private static volatile dssr<dveh> h;
    public boolean a;
    public int b = 15;
    public dsrj<dveg> c = dssu.b;
    public int d = 15;
    public boolean e;
    private int g;

    static {
        dveh dvehVar = new dveh();
        f = dvehVar;
        dsqw.cc(dveh.class, dvehVar);
    }

    private dveh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004\u001b\u0005ဇ\u0003", new Object[]{"g", "a", "b", "d", "c", dveg.class, "e"});
            }
            if (i2 == 3) {
                return new dveh();
            }
            if (i2 == 4) {
                return new dvee();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dveh> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dveh.class) {
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
