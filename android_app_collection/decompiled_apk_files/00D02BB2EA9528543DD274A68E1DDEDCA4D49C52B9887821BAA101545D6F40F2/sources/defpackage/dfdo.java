package defpackage;
/* compiled from: PG */
/* renamed from: dfdo  reason: default package */
/* loaded from: classes6.dex */
public final class dfdo extends dsqw<dfdo, dfdm> implements dssk {
    public static final dfdo g;
    private static volatile dssr<dfdo> i;
    public int a;
    public int b;
    public long c;
    public dfdj d;
    public ddyw e;
    public dsrj<dfdt> f;
    private byte h = 2;

    static {
        dfdo dfdoVar = new dfdo();
        g = dfdoVar;
        dsqw.cc(dfdo.class, dfdoVar);
    }

    private dfdo() {
        dspd dspdVar = dspd.b;
        this.f = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0002\r\u0005\u0000\u0001\u0001\u0002ဉ\u0002\u0003ᐉ\u0003\t\u001b\fဌ\u0000\rဂ\u0001", new Object[]{"a", "d", "e", "f", dfdt.class, "b", dfdn.a, "c"});
            }
            if (i3 == 3) {
                return new dfdo();
            }
            if (i3 == 4) {
                return new dfdm();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dfdo> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dfdo.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
