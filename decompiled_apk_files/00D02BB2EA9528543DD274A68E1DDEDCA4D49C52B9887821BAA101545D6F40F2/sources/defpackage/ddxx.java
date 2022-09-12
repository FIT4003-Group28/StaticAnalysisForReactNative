package defpackage;
/* compiled from: PG */
/* renamed from: ddxx  reason: default package */
/* loaded from: classes.dex */
public final class ddxx extends dsqw<ddxx, ddxw> implements dssk {
    public static final ddxx j;
    private static volatile dssr<ddxx> m;
    public int a;
    public ddhm c;
    public int d;
    public int e;
    public int h;
    public ddxz i;
    private byte l = 2;
    public int b = -1;
    private int k = -1;
    public int f = -1;
    public int g = -1;

    static {
        ddxx ddxxVar = new ddxx();
        j = ddxxVar;
        dsqw.cc(ddxx.class, ddxxVar);
    }

    private ddxx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(j, "\u0001\t\u0000\u0001\u0001\u000f\t\u0000\u0000\u0001\u0001င\u0000\u0002င\u0003\u0005င\u0005\u0006င\u0006\u0007င\u0007\bင\u0004\u000bင\u0001\rᐉ\u000b\u000fဉ\u0002", new Object[]{"a", "b", "d", "f", "g", "h", "e", "k", "i", "c"});
            }
            if (i2 == 3) {
                return new ddxx();
            }
            if (i2 == 4) {
                return new ddxw();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            }
            dssr<ddxx> dssrVar = m;
            if (dssrVar == null) {
                synchronized (ddxx.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.l);
    }
}
