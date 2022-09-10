package defpackage;
/* compiled from: PG */
/* renamed from: djph  reason: default package */
/* loaded from: classes6.dex */
public final class djph extends dsqw<djph, djpg> implements dssk {
    public static final djph e;
    private static volatile dssr<djph> f;
    public int a;
    public drhx b;
    public int c;
    public boolean d;

    static {
        djph djphVar = new djph();
        e = djphVar;
        dsqw.cc(djph.class, djphVar);
    }

    private djph() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0005ဌ\u0001\u0006ဇ\u0002", new Object[]{"a", "b", "c", drhl.c(), "d"});
            }
            if (i2 == 3) {
                return new djph();
            }
            if (i2 == 4) {
                return new djpg();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djph> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djph.class) {
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
