package defpackage;
/* compiled from: PG */
/* renamed from: draf  reason: default package */
/* loaded from: classes6.dex */
public final class draf extends dsqw<draf, drae> implements dssk {
    public static final draf c;
    private static volatile dssr<draf> d;
    public int a;
    public int b;

    static {
        draf drafVar = new draf();
        c = drafVar;
        dsqw.cc(draf.class, drafVar);
    }

    private draf() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", drba.a});
            }
            if (i2 == 3) {
                return new draf();
            }
            if (i2 == 4) {
                return new drae();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<draf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (draf.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
