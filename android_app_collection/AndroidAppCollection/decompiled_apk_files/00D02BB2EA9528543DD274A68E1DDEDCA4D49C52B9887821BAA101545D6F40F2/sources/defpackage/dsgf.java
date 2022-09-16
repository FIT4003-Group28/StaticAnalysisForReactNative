package defpackage;
/* compiled from: PG */
/* renamed from: dsgf  reason: default package */
/* loaded from: classes6.dex */
public final class dsgf extends dsqw<dsgf, dsge> implements dssk {
    public static final dsgf e;
    private static volatile dssr<dsgf> f;
    public int a;
    public int b;
    public String c = "";
    public dsgm d;

    static {
        dsgf dsgfVar = new dsgf();
        e = dsgfVar;
        dsqw.cc(dsgf.class, dsgfVar);
    }

    private dsgf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", dued.c(), "c", "d"});
            }
            if (i2 == 3) {
                return new dsgf();
            }
            if (i2 == 4) {
                return new dsge();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsgf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dsgf.class) {
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
