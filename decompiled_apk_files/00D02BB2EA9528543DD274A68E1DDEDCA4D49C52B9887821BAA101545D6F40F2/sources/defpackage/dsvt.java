package defpackage;
/* compiled from: PG */
/* renamed from: dsvt  reason: default package */
/* loaded from: classes6.dex */
public final class dsvt extends dsqw<dsvt, dsvm> implements dssk {
    public static final dsvt c;
    private static volatile dssr<dsvt> d;
    public int a = 0;
    public Object b;

    static {
        dsvt dsvtVar = new dsvt();
        c = dsvtVar;
        dsqw.cc(dsvt.class, dsvtVar);
    }

    private dsvt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", dsvq.class, dsvs.class});
            }
            if (i2 == 3) {
                return new dsvt();
            }
            if (i2 == 4) {
                return new dsvm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsvt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dsvt.class) {
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
