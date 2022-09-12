package defpackage;
/* compiled from: PG */
/* renamed from: dkti  reason: default package */
/* loaded from: classes.dex */
public final class dkti extends dsqw<dkti, dktg> implements dssk {
    public static final dkti e;
    private static volatile dssr<dkti> f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        dkti dktiVar = new dkti();
        e = dktiVar;
        dsqw.cc(dkti.class, dktiVar);
    }

    private dkti() {
        dsqz dsqzVar = dsqz.b;
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0007ဌ\u0004", new Object[]{"a", "b", dktk.c(), "c", dkte.a, "d", dkth.a});
            }
            if (i2 == 3) {
                return new dkti();
            }
            if (i2 == 4) {
                return new dktg();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkti> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkti.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
