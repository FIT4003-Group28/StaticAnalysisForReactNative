package defpackage;
/* compiled from: PG */
/* renamed from: dhpc  reason: default package */
/* loaded from: classes6.dex */
public final class dhpc extends dsqw<dhpc, dhpb> implements dssk {
    public static final dhpc c;
    private static volatile dssr<dhpc> e;
    public int a;
    public dqps b;
    private int d;

    static {
        dhpc dhpcVar = new dhpc();
        c = dhpcVar;
        dsqw.cc(dhpc.class, dhpcVar);
    }

    private dhpc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", dqhy.c(), "b"});
            }
            if (i2 == 3) {
                return new dhpc();
            }
            if (i2 == 4) {
                return new dhpb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhpc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhpc.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
