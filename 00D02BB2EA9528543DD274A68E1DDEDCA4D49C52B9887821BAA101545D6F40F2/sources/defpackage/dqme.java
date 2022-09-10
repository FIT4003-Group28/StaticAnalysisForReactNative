package defpackage;
/* compiled from: PG */
/* renamed from: dqme  reason: default package */
/* loaded from: classes6.dex */
public final class dqme extends dsqw<dqme, dqmd> implements dssk {
    public static final dqme d;
    private static volatile dssr<dqme> e;
    public int a;
    public boolean b;
    public boolean c;

    static {
        dqme dqmeVar = new dqme();
        d = dqmeVar;
        dsqw.cc(dqme.class, dqmeVar);
    }

    private dqme() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqme();
            }
            if (i2 == 4) {
                return new dqmd();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqme> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqme.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
