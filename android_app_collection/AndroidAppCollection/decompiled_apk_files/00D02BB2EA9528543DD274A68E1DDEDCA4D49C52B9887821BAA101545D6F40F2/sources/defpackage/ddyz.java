package defpackage;
/* compiled from: PG */
/* renamed from: ddyz  reason: default package */
/* loaded from: classes6.dex */
public final class ddyz extends dsqw<ddyz, ddyy> implements dssk {
    public static final ddyz f;
    private static volatile dssr<ddyz> h;
    public int a;
    public int e;
    private byte g = 2;
    public String b = "";
    public String c = "";
    public String d = "";

    static {
        ddyz ddyzVar = new ddyz();
        f = ddyzVar;
        dsqw.cc(ddyz.class, ddyzVar);
    }

    private ddyz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0003\u0005ᔈ\u0000\u0006ᔈ\u0001\u0007ဈ\u0002\bᔄ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new ddyz();
            }
            if (i2 == 4) {
                return new ddyy();
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
            dssr<ddyz> dssrVar = h;
            if (dssrVar == null) {
                synchronized (ddyz.class) {
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
