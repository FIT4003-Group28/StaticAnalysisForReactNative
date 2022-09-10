package defpackage;
/* compiled from: PG */
/* renamed from: dxci  reason: default package */
/* loaded from: classes6.dex */
public final class dxci extends dsqw<dxci, dxch> implements dssk {
    public static final dxci e;
    private static volatile dssr<dxci> i;
    public int a;
    public dxag b;
    public long d;
    private dxba f;
    private dxac g;
    private byte h = 2;
    public String c = "";

    static {
        dxci dxciVar = new dxci();
        e = dxciVar;
        dsqw.cc(dxci.class, dxciVar);
    }

    private dxci() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(e, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᔈ\u0003\u0004ᐉ\u0001\u0006ᐉ\u0002\u0007စ\u0004", new Object[]{"a", "f", "c", "g", "b", "d"});
            }
            if (i3 == 3) {
                return new dxci();
            }
            if (i3 == 4) {
                return new dxch();
            }
            if (i3 == 5) {
                return e;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dxci> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dxci.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
