package defpackage;
/* compiled from: PG */
/* renamed from: dijr  reason: default package */
/* loaded from: classes6.dex */
public final class dijr extends dsqw<dijr, dijo> implements dssk {
    public static final dijr e;
    private static volatile dssr<dijr> h;
    public int a;
    public int b;
    public dijn c;
    private dnqh f;
    private byte g = 2;
    public String d = "";

    static {
        dijr dijrVar = new dijr();
        e = dijrVar;
        dsqw.cc(dijr.class, dijrVar);
    }

    private dijr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဉ\u0001\u0002ဈ\u0002\u0003ᐉ\u0003\u0005ဌ\u0000", new Object[]{"a", "c", "d", "f", "b", dijp.a});
            }
            if (i2 == 3) {
                return new dijr();
            }
            if (i2 == 4) {
                return new dijo();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dijr> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dijr.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
