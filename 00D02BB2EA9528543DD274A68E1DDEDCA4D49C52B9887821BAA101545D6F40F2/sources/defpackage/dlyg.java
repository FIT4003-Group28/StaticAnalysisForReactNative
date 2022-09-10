package defpackage;
/* compiled from: PG */
/* renamed from: dlyg  reason: default package */
/* loaded from: classes6.dex */
public final class dlyg extends dsqw<dlyg, dlyf> implements dssk {
    public static final dlyg g;
    private static volatile dssr<dlyg> i;
    public long a;
    public long b;
    public float c;
    public float d;
    public boolean e;
    public dsrf f = dsqz.b;
    private int h;

    static {
        dlyg dlygVar = new dlyg();
        g = dlygVar;
        dsqw.cc(dlyg.class, dlygVar);
    }

    private dlyg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဃ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ဇ\u0004\u0006\u0016", new Object[]{"h", "a", "b", "c", "d", "e", "f"});
            }
            if (i3 == 3) {
                return new dlyg();
            }
            if (i3 == 4) {
                return new dlyf();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dlyg> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dlyg.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
