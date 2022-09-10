package defpackage;
/* compiled from: PG */
/* renamed from: ddza  reason: default package */
/* loaded from: classes6.dex */
public final class ddza extends dsqw<ddza, ddyx> implements dssk {
    public static final ddza d;
    private static volatile dssr<ddza> f;
    public int a;
    private byte e = 2;
    public String b = "";
    public dsrj<ddyz> c = dssu.b;

    static {
        ddza ddzaVar = new ddza();
        d = ddzaVar;
        dsqw.cc(ddza.class, ddzaVar);
    }

    private ddza() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0002\u0001ᔈ\u0000\u0004б", new Object[]{"a", "b", "c", ddyz.class});
            }
            if (i2 == 3) {
                return new ddza();
            }
            if (i2 == 4) {
                return new ddyx();
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
            dssr<ddza> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddza.class) {
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
