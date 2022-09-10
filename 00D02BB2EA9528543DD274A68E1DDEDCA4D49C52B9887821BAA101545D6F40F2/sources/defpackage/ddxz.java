package defpackage;
/* compiled from: PG */
/* renamed from: ddxz  reason: default package */
/* loaded from: classes.dex */
public final class ddxz extends dsqw<ddxz, ddxy> implements dssk {
    public static final ddxz d;
    private static volatile dssr<ddxz> f;
    public int a;
    public ddyb b;
    public long c;
    private byte e = 2;

    static {
        ddxz ddxzVar = new ddxz();
        d = ddxzVar;
        dsqw.cc(ddxz.class, ddxzVar);
    }

    private ddxz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddxz();
            }
            if (i2 == 4) {
                return new ddxy();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<ddxz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddxz.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
