package defpackage;
/* compiled from: PG */
/* renamed from: drig  reason: default package */
/* loaded from: classes6.dex */
public final class drig extends dsqw<drig, drhz> implements dssk {
    public static final drig c;
    private static volatile dssr<drig> d;
    public int a = 0;
    public Object b;

    static {
        drig drigVar = new drig();
        c = drigVar;
        dsqw.cc(drig.class, drigVar);
    }

    private drig() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", drid.class, drib.class, drif.class});
            }
            if (i2 == 3) {
                return new drig();
            }
            if (i2 == 4) {
                return new drhz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drig> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drig.class) {
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
