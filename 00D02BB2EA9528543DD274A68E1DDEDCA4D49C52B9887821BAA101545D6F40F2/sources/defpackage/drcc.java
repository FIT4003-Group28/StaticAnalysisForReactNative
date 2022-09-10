package defpackage;
/* compiled from: PG */
/* renamed from: drcc  reason: default package */
/* loaded from: classes6.dex */
public final class drcc extends dsqw<drcc, drcb> implements dssk {
    public static final drcc c;
    private static volatile dssr<drcc> d;
    public int a;
    public drce b;

    static {
        drcc drccVar = new drcc();
        c = drccVar;
        dsqw.cc(drcc.class, drccVar);
    }

    private drcc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new drcc();
            }
            if (i2 == 4) {
                return new drcb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drcc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drcc.class) {
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
