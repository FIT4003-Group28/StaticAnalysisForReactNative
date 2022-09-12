package defpackage;
/* compiled from: PG */
/* renamed from: dsgb  reason: default package */
/* loaded from: classes6.dex */
public final class dsgb extends dsqw<dsgb, dsga> implements dssk {
    public static final dsgb c;
    private static volatile dssr<dsgb> d;
    public int a = 0;
    public Object b;

    static {
        dsgb dsgbVar = new dsgb();
        c = dsgbVar;
        dsqw.cc(dsgb.class, dsgbVar);
    }

    private dsgb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဴ\u0000\u0002ြ\u0000", new Object[]{"b", "a", dseo.class});
            }
            if (i2 == 3) {
                return new dsgb();
            }
            if (i2 == 4) {
                return new dsga();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsgb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dsgb.class) {
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
