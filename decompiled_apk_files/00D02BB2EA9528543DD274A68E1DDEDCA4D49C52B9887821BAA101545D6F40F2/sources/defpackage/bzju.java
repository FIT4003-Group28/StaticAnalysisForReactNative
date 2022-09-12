package defpackage;
/* compiled from: PG */
/* renamed from: bzju  reason: default package */
/* loaded from: classes4.dex */
public final class bzju extends dsqw<bzju, bzjr> implements dssk {
    public static final bzju e;
    private static volatile dssr<bzju> g;
    public int a;
    public int d;
    private byte f = 2;
    public dsrj<dpce> b = dssu.b;
    public dsrj<bzjd> c = dssu.b;

    static {
        bzju bzjuVar = new bzju();
        e = bzjuVar;
        dsqw.cc(bzju.class, bzjuVar);
    }

    private bzju() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0005\u0007\u0003\u0000\u0002\u0001\u0005\u001b\u0006Л\u0007ဌ\u0000", new Object[]{"a", "c", bzjd.class, "b", dpce.class, "d", bzjt.c()});
            }
            if (i2 == 3) {
                return new bzju();
            }
            if (i2 == 4) {
                return new bzjr();
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
            dssr<bzju> dssrVar = g;
            if (dssrVar == null) {
                synchronized (bzju.class) {
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
