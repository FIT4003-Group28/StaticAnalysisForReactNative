package defpackage;
/* compiled from: PG */
/* renamed from: dtjx  reason: default package */
/* loaded from: classes6.dex */
public final class dtjx extends dsqw<dtjx, dtjw> implements dssk {
    public static final dtjx f;
    private static volatile dssr<dtjx> h;
    public int a;
    public dtjv c;
    public boolean e;
    private byte g = 2;
    public dsrj<dtov> b = dssu.b;
    public String d = "";

    static {
        dtjx dtjxVar = new dtjx();
        f = dtjxVar;
        dsqw.cc(dtjx.class, dtjxVar);
    }

    private dtjx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000\u0003ဈ\u0001\u0004ဇ\u0002", new Object[]{"a", "b", dtov.class, "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dtjx();
            }
            if (i2 == 4) {
                return new dtjw();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dtjx> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dtjx.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
