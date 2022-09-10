package defpackage;
/* compiled from: PG */
/* renamed from: dxco  reason: default package */
/* loaded from: classes6.dex */
public final class dxco extends dsqw<dxco, dxcn> implements dssk {
    public static final dxco e;
    private static volatile dssr<dxco> g;
    public int a;
    public boolean c;
    public djuh d;
    private byte f = 2;
    public dsrj<dxbz> b = dssu.b;

    static {
        dxco dxcoVar = new dxco();
        e = dxcoVar;
        dsqw.cc(dxco.class, dxcoVar);
    }

    private dxco() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001Л\u0002ဇ\u0000\u0003ᐉ\u0001", new Object[]{"a", "b", dxbz.class, "c", "d"});
            }
            if (i2 == 3) {
                return new dxco();
            }
            if (i2 == 4) {
                return new dxcn();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dxco> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dxco.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
