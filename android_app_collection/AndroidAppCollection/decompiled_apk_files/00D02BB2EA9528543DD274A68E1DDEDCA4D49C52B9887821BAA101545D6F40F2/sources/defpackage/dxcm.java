package defpackage;
/* compiled from: PG */
/* renamed from: dxcm  reason: default package */
/* loaded from: classes6.dex */
public final class dxcm extends dsqw<dxcm, dxcl> implements dssk {
    public static final dxcm c;
    private static volatile dssr<dxcm> f;
    public int a;
    public dxci b;
    private dxck d;
    private byte e = 2;

    static {
        dxcm dxcmVar = new dxcm();
        c = dxcmVar;
        dsqw.cc(dxcm.class, dxcmVar);
    }

    private dxcm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "d", "b"});
            }
            if (i2 == 3) {
                return new dxcm();
            }
            if (i2 == 4) {
                return new dxcl();
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
            dssr<dxcm> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dxcm.class) {
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
