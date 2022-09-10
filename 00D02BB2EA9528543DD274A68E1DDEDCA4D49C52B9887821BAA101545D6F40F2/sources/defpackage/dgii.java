package defpackage;
/* compiled from: PG */
/* renamed from: dgii  reason: default package */
/* loaded from: classes6.dex */
public final class dgii extends dsqs<dgii, dgid> implements dsqt {
    public static final dgii e;
    private static volatile dssr<dgii> g;
    public int a;
    public dgly b;
    public dgih d;
    private byte f = 2;
    public String c = "";

    static {
        dgii dgiiVar = new dgii();
        e = dgiiVar;
        dsqw.cc(dgii.class, dgiiVar);
    }

    private dgii() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0004ဉ\u0002\u0005ဈ\u0001", new Object[]{"a", "b", "d", "c"});
            }
            if (i2 == 3) {
                return new dgii();
            }
            if (i2 == 4) {
                return new dgid();
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
            dssr<dgii> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dgii.class) {
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
