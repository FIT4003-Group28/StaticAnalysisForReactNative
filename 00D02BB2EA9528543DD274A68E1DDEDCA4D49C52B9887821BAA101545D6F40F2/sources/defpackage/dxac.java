package defpackage;
/* compiled from: PG */
/* renamed from: dxac  reason: default package */
/* loaded from: classes6.dex */
public final class dxac extends dsqw<dxac, dxab> implements dssk {
    public static final dxac a;
    private static volatile dssr<dxac> e;
    private int b;
    private dwzm c;
    private byte d = 2;

    static {
        dxac dxacVar = new dxac();
        a = dxacVar;
        dsqw.cc(dxac.class, dxacVar);
    }

    private dxac() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0002", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dxac();
            }
            if (i2 == 4) {
                return new dxab();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dxac> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxac.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
