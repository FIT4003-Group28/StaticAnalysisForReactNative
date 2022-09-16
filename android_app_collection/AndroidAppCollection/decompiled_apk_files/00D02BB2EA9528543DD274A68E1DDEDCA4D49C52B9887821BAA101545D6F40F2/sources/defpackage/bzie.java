package defpackage;
/* compiled from: PG */
/* renamed from: bzie  reason: default package */
/* loaded from: classes4.dex */
public final class bzie extends dsqw<bzie, bzid> implements dssk {
    public static final bzie e;
    private static volatile dssr<bzie> f;
    public int a;
    public int b = 5;
    public int c = 20;
    public int d = 60;

    static {
        bzie bzieVar = new bzie();
        e = bzieVar;
        dsqw.cc(bzie.class, bzieVar);
    }

    private bzie() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new bzie();
            }
            if (i2 == 4) {
                return new bzid();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bzie> dssrVar = f;
            if (dssrVar == null) {
                synchronized (bzie.class) {
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
