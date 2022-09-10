package defpackage;
/* compiled from: PG */
/* renamed from: dseu  reason: default package */
/* loaded from: classes6.dex */
public final class dseu extends dsqw<dseu, dset> implements dssk {
    public static final dseu d;
    private static volatile dssr<dseu> e;
    public int a;
    public duhk b;
    public duhk c;

    static {
        dseu dseuVar = new dseu();
        d = dseuVar;
        dsqw.cc(dseu.class, dseuVar);
    }

    private dseu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dseu();
            }
            if (i2 == 4) {
                return new dset();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dseu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dseu.class) {
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
