package defpackage;
/* compiled from: PG */
/* renamed from: ddep  reason: default package */
/* loaded from: classes.dex */
public final class ddep extends dsqw<ddep, ddeo> implements dssk {
    public static final ddep f;
    private static volatile dssr<ddep> h;
    public int a;
    public dtbk b;
    public boolean c;
    public int d;
    public int e;
    private byte g = 2;

    static {
        ddep ddepVar = new ddep();
        f = ddepVar;
        dsqw.cc(ddep.class, ddepVar);
    }

    private ddep() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဆ\u0002\u0004ဆ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new ddep();
            }
            if (i2 == 4) {
                return new ddeo();
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
            dssr<ddep> dssrVar = h;
            if (dssrVar == null) {
                synchronized (ddep.class) {
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
