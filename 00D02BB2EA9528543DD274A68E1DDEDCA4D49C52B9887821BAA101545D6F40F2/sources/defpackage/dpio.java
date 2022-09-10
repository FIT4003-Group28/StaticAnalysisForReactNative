package defpackage;
/* compiled from: PG */
/* renamed from: dpio  reason: default package */
/* loaded from: classes6.dex */
public final class dpio extends dsqw<dpio, dpil> implements dpip {
    public static final dpio g;
    private static volatile dssr<dpio> i;
    public int a;
    public dpfh d;
    private byte h = 2;
    public int b = 1;
    public int c = 1;
    public dspd e = dspd.b;
    public dspd f = dspd.b;

    static {
        dpio dpioVar = new dpio();
        g = dpioVar;
        dsqw.cc(dpio.class, dpioVar);
    }

    private dpio() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဌ\u0001\u0005ᐉ\u0002\u0006ည\u0003\u0007ည\u0004", new Object[]{"a", "b", dqum.c(), "c", dpim.a, "d", "e", "f"});
            }
            if (i3 == 3) {
                return new dpio();
            }
            if (i3 == 4) {
                return new dpil();
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
            dssr<dpio> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dpio.class) {
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
