package defpackage;
/* compiled from: PG */
/* renamed from: bwnv  reason: default package */
/* loaded from: classes4.dex */
public final class bwnv extends dsqw<bwnv, bwnu> implements dssk {
    public static final bwnv e;
    private static volatile dssr<bwnv> g;
    public int a;
    public dtnh b;
    public long c;
    public boolean d;
    private byte f = 2;

    static {
        bwnv bwnvVar = new bwnv();
        e = bwnvVar;
        dsqw.cc(bwnv.class, bwnvVar);
    }

    private bwnv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new bwnv();
            }
            if (i2 == 4) {
                return new bwnu();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<bwnv> dssrVar = g;
            if (dssrVar == null) {
                synchronized (bwnv.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
