package defpackage;
/* compiled from: PG */
/* renamed from: dxdq  reason: default package */
/* loaded from: classes6.dex */
public final class dxdq extends dsqw<dxdq, dxdp> implements dssk {
    public static final dxdq a;
    private static volatile dssr<dxdq> e;
    private int b;
    private dwzj c;
    private byte d = 2;

    static {
        dxdq dxdqVar = new dxdq();
        a = dxdqVar;
        dsqw.cc(dxdq.class, dxdqVar);
    }

    private dxdq() {
        dsqz dsqzVar = dsqz.b;
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
                return new dxdq();
            }
            if (i2 == 4) {
                return new dxdp();
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
            dssr<dxdq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxdq.class) {
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
