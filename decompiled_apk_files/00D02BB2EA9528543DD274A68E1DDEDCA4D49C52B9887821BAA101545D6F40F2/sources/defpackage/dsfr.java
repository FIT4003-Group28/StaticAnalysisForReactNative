package defpackage;
/* compiled from: PG */
/* renamed from: dsfr  reason: default package */
/* loaded from: classes6.dex */
public final class dsfr extends dsqw<dsfr, dsfp> implements dssk {
    public static final dsfr d;
    private static volatile dssr<dsfr> e;
    public Object b;
    public int a = 0;
    public dsrj<dsew> c = dssu.b;

    static {
        dsfr dsfrVar = new dsfr();
        d = dsfrVar;
        dsqw.cc(dsfr.class, dsfrVar);
    }

    private dsfr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ြ\u0000", new Object[]{"b", "a", "c", dsew.class, dsfz.class});
            }
            if (i2 == 3) {
                return new dsfr();
            }
            if (i2 == 4) {
                return new dsfp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsfr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsfr.class) {
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
