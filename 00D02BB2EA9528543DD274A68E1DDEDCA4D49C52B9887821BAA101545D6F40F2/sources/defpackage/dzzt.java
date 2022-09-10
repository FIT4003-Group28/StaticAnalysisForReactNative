package defpackage;
/* compiled from: PG */
/* renamed from: dzzt  reason: default package */
/* loaded from: classes6.dex */
public final class dzzt extends dsqw<dzzt, dzzq> implements dssk {
    public static final dzzt c;
    private static volatile dssr<dzzt> d;
    public int a;
    public int b = -1;

    static {
        dzzt dzztVar = new dzzt();
        c = dzztVar;
        dsqw.cc(dzzt.class, dzztVar);
    }

    private dzzt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dzzr.a});
            }
            if (i2 == 3) {
                return new dzzt();
            }
            if (i2 == 4) {
                return new dzzq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dzzt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dzzt.class) {
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
