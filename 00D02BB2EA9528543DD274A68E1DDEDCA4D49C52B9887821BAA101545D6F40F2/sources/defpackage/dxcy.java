package defpackage;
/* compiled from: PG */
/* renamed from: dxcy  reason: default package */
/* loaded from: classes6.dex */
public final class dxcy extends dsqw<dxcy, dxcx> implements dssk {
    public static final dxcy c;
    private static volatile dssr<dxcy> f;
    public int a;
    public dxcs b;
    private dxde d;
    private byte e = 2;

    static {
        dxcy dxcyVar = new dxcy();
        c = dxcyVar;
        dsqw.cc(dxcy.class, dxcyVar);
    }

    private dxcy() {
        dspd dspdVar = dspd.b;
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0004ဉ\u0002", new Object[]{"a", "d", "b"});
            }
            if (i2 == 3) {
                return new dxcy();
            }
            if (i2 == 4) {
                return new dxcx();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dxcy> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dxcy.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
