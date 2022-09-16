package defpackage;
/* compiled from: PG */
/* renamed from: dklu  reason: default package */
/* loaded from: classes.dex */
public final class dklu extends dsqw<dklu, dklt> implements dssk {
    public static final dklu c;
    private static volatile dssr<dklu> e;
    public boolean a;
    public boolean b;
    private int d;

    static {
        dklu dkluVar = new dklu();
        c = dkluVar;
        dsqw.cc(dklu.class, dkluVar);
    }

    private dklu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0006ဇ\u0005", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dklu();
            }
            if (i2 == 4) {
                return new dklt();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dklu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dklu.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
