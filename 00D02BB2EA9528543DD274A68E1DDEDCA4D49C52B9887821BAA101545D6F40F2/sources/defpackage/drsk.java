package defpackage;
/* compiled from: PG */
/* renamed from: drsk  reason: default package */
/* loaded from: classes6.dex */
public final class drsk extends dsqw<drsk, drsj> implements dssk {
    public static final drsk e;
    private static volatile dssr<drsk> f;
    public int a;
    public droz b;
    public drps c;
    public int d;

    static {
        drsk drskVar = new drsk();
        e = drskVar;
        dsqw.cc(drsk.class, drskVar);
    }

    private drsk() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဌ\u0002", new Object[]{"a", "b", "c", "d", drsi.a});
            }
            if (i2 == 3) {
                return new drsk();
            }
            if (i2 == 4) {
                return new drsj();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drsk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drsk.class) {
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