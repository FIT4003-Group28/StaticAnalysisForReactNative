package defpackage;
/* compiled from: PG */
/* renamed from: dszi  reason: default package */
/* loaded from: classes6.dex */
public final class dszi extends dsqw<dszi, dszh> implements dssk {
    public static final dszi d;
    private static volatile dssr<dszi> e;
    public dxwi a;
    public dxnc b;
    public dxob c;

    static {
        dszi dsziVar = new dszi();
        d = dsziVar;
        dsqw.cc(dszi.class, dsziVar);
    }

    private dszi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dszi();
            }
            if (i2 == 4) {
                return new dszh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dszi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dszi.class) {
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
