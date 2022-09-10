package defpackage;
/* compiled from: PG */
/* renamed from: dlcx  reason: default package */
/* loaded from: classes6.dex */
public final class dlcx extends dsqw<dlcx, dlcw> implements dssk {
    public static final dlcx e;
    private static volatile dssr<dlcx> g;
    public int a;
    public dvyw c;
    public boolean d;
    private byte f = 2;
    public String b = "";

    static {
        dlcx dlcxVar = new dlcx();
        e = dlcxVar;
        dsqw.cc(dlcx.class, dlcxVar);
    }

    private dlcx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ᐉ\u0001\u0003ဇ\u0003\u0004ဈ\u0000", new Object[]{"a", "c", "d", "b"});
            }
            if (i2 == 3) {
                return new dlcx();
            }
            if (i2 == 4) {
                return new dlcw();
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
            dssr<dlcx> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlcx.class) {
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
