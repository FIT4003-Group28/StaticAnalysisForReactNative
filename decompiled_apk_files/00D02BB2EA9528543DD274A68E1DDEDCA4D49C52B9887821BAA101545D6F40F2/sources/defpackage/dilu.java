package defpackage;
/* compiled from: PG */
/* renamed from: dilu  reason: default package */
/* loaded from: classes6.dex */
public final class dilu extends dsqw<dilu, dilt> implements dssk {
    public static final dilu f;
    private static volatile dssr<dilu> h;
    public int a;
    public djnc c;
    public djrs d;
    private byte g = 2;
    public dsrj<dhyd> b = dssu.b;
    public dspd e = dspd.b;

    static {
        dilu diluVar = new dilu();
        f = diluVar;
        dsqw.cc(dilu.class, diluVar);
    }

    private dilu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0004\u0007\u0004\u0000\u0001\u0002\u0004ဉ\u0000\u0005ည\u0002\u0006Л\u0007ᐉ\u0001", new Object[]{"a", "c", "e", "b", dhyd.class, "d"});
            }
            if (i2 == 3) {
                return new dilu();
            }
            if (i2 == 4) {
                return new dilt();
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
            dssr<dilu> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dilu.class) {
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
