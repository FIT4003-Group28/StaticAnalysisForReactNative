package defpackage;
/* compiled from: PG */
/* renamed from: dond  reason: default package */
/* loaded from: classes6.dex */
public final class dond extends dsqw<dond, donc> implements dssk {
    public static final dond d;
    private static volatile dssr<dond> e;
    public int a;
    public int b;
    public int c;

    static {
        dond dondVar = new dond();
        d = dondVar;
        dsqw.cc(dond.class, dondVar);
    }

    private dond() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", donb.c(), "c", domy.c()});
            }
            if (i2 == 3) {
                return new dond();
            }
            if (i2 == 4) {
                return new donc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dond> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dond.class) {
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
