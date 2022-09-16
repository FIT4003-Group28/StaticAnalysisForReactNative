package defpackage;
/* compiled from: PG */
/* renamed from: drgb  reason: default package */
/* loaded from: classes6.dex */
public final class drgb extends dsqw<drgb, drfz> implements dssk {
    public static final drgb c;
    private static volatile dssr<drgb> d;
    public int a = 0;
    public Object b;

    static {
        drgb drgbVar = new drgb();
        c = drgbVar;
        dsqw.cc(drgb.class, drgbVar);
    }

    private drgb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", drgn.class});
            }
            if (i2 == 3) {
                return new drgb();
            }
            if (i2 == 4) {
                return new drfz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drgb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drgb.class) {
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
