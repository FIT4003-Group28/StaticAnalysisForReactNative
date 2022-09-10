package defpackage;
/* compiled from: PG */
/* renamed from: dldo  reason: default package */
/* loaded from: classes6.dex */
public final class dldo extends dsqw<dldo, dldn> implements dssk {
    public static final dldo d;
    private static volatile dssr<dldo> g;
    public dlcx a;
    public dlcz c;
    private int e;
    private byte f = 2;
    public dsrj<dwfl> b = dssu.b;

    static {
        dldo dldoVar = new dldo();
        d = dldoVar;
        dsqw.cc(dldo.class, dldoVar);
    }

    private dldo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"e", "a", "b", dwfl.class, "c"});
            }
            if (i2 == 3) {
                return new dldo();
            }
            if (i2 == 4) {
                return new dldn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dldo> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dldo.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
