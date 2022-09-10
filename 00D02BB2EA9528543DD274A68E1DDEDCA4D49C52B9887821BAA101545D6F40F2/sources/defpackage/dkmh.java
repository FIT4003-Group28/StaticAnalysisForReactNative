package defpackage;
/* compiled from: PG */
/* renamed from: dkmh  reason: default package */
/* loaded from: classes.dex */
public final class dkmh extends dsqw<dkmh, dkmg> implements dssk {
    public static final dkmh f;
    private static volatile dssr<dkmh> h;
    public boolean a;
    public boolean b;
    public int c = 1500;
    public boolean d;
    public boolean e;
    private int g;

    static {
        dkmh dkmhVar = new dkmh();
        f = dkmhVar;
        dsqw.cc(dkmh.class, dkmhVar);
    }

    private dkmh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0004ဇ\u0003\u0005င\u0004\tဇ\u0007\nဇ\b", new Object[]{"g", "a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dkmh();
            }
            if (i2 == 4) {
                return new dkmg();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkmh> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dkmh.class) {
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
