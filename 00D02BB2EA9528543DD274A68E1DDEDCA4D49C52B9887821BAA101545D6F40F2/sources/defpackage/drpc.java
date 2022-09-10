package defpackage;
/* compiled from: PG */
/* renamed from: drpc  reason: default package */
/* loaded from: classes6.dex */
public final class drpc extends dsqw<drpc, drpa> implements dssk {
    public static final drpc d;
    private static volatile dssr<drpc> e;
    public int a;
    public drpq b;
    public int c;

    static {
        drpc drpcVar = new drpc();
        d = drpcVar;
        dsqw.cc(drpc.class, drpcVar);
    }

    private drpc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", drpb.a});
            }
            if (i2 == 3) {
                return new drpc();
            }
            if (i2 == 4) {
                return new drpa();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drpc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drpc.class) {
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
